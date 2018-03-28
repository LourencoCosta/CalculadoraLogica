/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralogica.process;

import java.util.Arrays;
import java.util.List;
import structures.Queue;
import structures.Stack;

/**
 *
 * @author rlc
 */
public class CalculaExpressao {

    private String v1;
    private String v2;
    private String opl;
    private Stack stackResult;

    public CalculaExpressao(int stackLength) {

        this.stackResult = new Stack(stackLength);
        this.v1 = new String();
        this.v2 = new String();
        this.opl = new String();
    }

    public String execute(Queue queueofOut) {
        return Calculates(queueofOut);
    }

    private String Calculates(Queue queueofOut) {
        System.out.println("TEST");

        while (!queueofOut.isEmpty()) {
            if (queueofOut.getValue().equals("T") || queueofOut.getValue().equals("F")) {
                stackResult.push(queueofOut.getValue());
                System.out.println("Fila de resultado:" + stackResult.getValue());
                System.out.println("Removido:" + queueofOut.getValue());
                queueofOut.remove();
            }
            List listaOperadores = Arrays.asList(new String[]{"~", "-", "^", "V", "<"});
            if (listaOperadores.contains(queueofOut.getValue())) {
                opl = queueofOut.getValue();
                System.out.println("opl:" + opl);
                queueofOut.remove();
                v2 = stackResult.getValue();
                System.out.println("v2:" + v2);
                stackResult.pop();
                if (!opl.equals("~")) {
                    v1 = stackResult.getValue();
                    System.out.println("v1:" + v1);
                    stackResult.pop();
                    stackResult.push(result(v1, opl, v2));
                    System.out.println("Resultado:" + stackResult.getValue());
                } else {
                    if (v2.equals("T")) {
                        stackResult.push("F");
                        System.out.println("Resultado:" + stackResult.getValue());
                    } else {
                        stackResult.push("T");
                        System.out.println("Resultado:" + stackResult.getValue());
                    }
                }
            }
        }
        return stackResult.getValue();
    }

    private String result(String v1, String opl, String v2) {
        switch (opl) {
            case "^":
                if (v1.equals(v2) && v1.equals("T")) {
                    return "T";
                } else {
                    return "F";
                }

            case "V":
                if (v1.equals(v2) && v1.equals("F")) {
                    return "F";
                } else {
                    return "T";
                }
            case "-":
                if (v1.equals("T") && v2.equals("F")) {
                    return "F";
                } else {
                    return "T";
                }
            case "<":
                if (v1.equals(v2)) {
                    return "T";
                } else {
                    return "F";
                }

        }
        return null;
    }
}

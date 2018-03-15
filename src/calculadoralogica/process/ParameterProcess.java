/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralogica.process;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import structures.MatrizDePrecedencia;
import structures.Queue;
import structures.Stack;

/**
 *
 * @author rlc
 */
public class ParameterProcess {

    private Stack stackOfOperators;
    private Queue queueOfOut;
    private final Map<String, Integer> parametersValues = new HashMap();

    public ParameterProcess(int stackLength, int queueLength) {
        parametersValues.put("(", 0);
        parametersValues.put("~", 1);
        parametersValues.put("^", 2);
        parametersValues.put("V", 3);
        parametersValues.put("-", 4);
        parametersValues.put("<", 5);
        parametersValues.put(")", 6);
        this.queueOfOut = new Queue(queueLength);
        this.stackOfOperators = new Stack(stackLength);
    }

    public void processValues(String value) {
//(TVF)->F
        if (value.equals("(")) {
            stackOfOperators.push(value);
        } else if (value.equals("T") || value.equals("F")) {
            queueOfOut.insert(value);
        } else {
            List listaOperadores = Arrays.asList(new String[]{"~", "-", "^", "V", "<"});

            if (listaOperadores.contains(value)) {
                if (!stackOfOperators.isEmpty()) {
                    boolean precedencia = MatrizDePrecedencia.verficaMatrizDeprec(parametersValues.get(stackOfOperators.getValue()), parametersValues.get(value));

                    while (precedencia) {
                        queueOfOut.insert(stackOfOperators.getValue());
                        stackOfOperators.pop();
                        precedencia = MatrizDePrecedencia.verficaMatrizDeprec(parametersValues.get(stackOfOperators.getValue()), parametersValues.get(value));
                    }
                    if (!precedencia) {
                        stackOfOperators.push(value);
                    }
                } else {
                    stackOfOperators.push(value);
                }
            }

            if (value.equals(")")) {
                
                while (!stackOfOperators.getValue().equals("(")) {
                    queueOfOut.insert(stackOfOperators.getValue());
                    stackOfOperators.pop();
                }
                stackOfOperators.pop();
            }
        }

    }

    private Queue mountExpressionPosFixed(Queue queueOfOut) {
        

        while (!stackOfOperators.isEmpty()){      
             queueOfOut.insert(stackOfOperators.getValue());
            stackOfOperators.pop();
        }
        return queueOfOut;
    }

    public Queue execute(String logicExpression) {
        StringTokenizer expressionCracked = new StringTokenizer(logicExpression, "~^V-<()", true);
        while (expressionCracked.hasMoreTokens()) {
            this.processValues(expressionCracked.nextToken().toString());
        }
        return mountExpressionPosFixed(queueOfOut);
    }
}

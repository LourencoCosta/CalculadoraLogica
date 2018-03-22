/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralogica.process;

import Exceptions.ValidateExpressionException;
import static java.lang.Math.exp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import structures.Queue;
import structures.Stack;

/**
 * @author rlc
 */
public class ValidationRules {

    public boolean execute(String logicExpression) throws ValidateExpressionException {
        validateExpressionNotEmpty(logicExpression);
        validateNumberNotOddOfParentheses(logicExpression);
        validateExpressionWithTerms(logicExpression);
        validateExpressionStarDifferentOfOperand(logicExpression);
        validateCompleteExpression(logicExpression);
        validateOperandNotInCorrectPosition(logicExpression);
                
        
        validateExpressionWithoutTwoOrMoreOperandsInSequence(logicExpression);
        validateContentsInsideOfParentheses(logicExpression);
        
         
        
        return true;
    }

    //if the expression is empty
    public boolean validateExpressionNotEmpty(String logicExpression) throws ValidateExpressionException {

        if (logicExpression.isEmpty()) {
            throw new ValidateExpressionException("This expression is empty");
        }
        return true;
    }

    //if the expression contains a number odd of parentheses
    public boolean validateNumberNotOddOfParentheses(String logicExpression) throws ValidateExpressionException {
        int openParenthese = logicExpression.length() - logicExpression.replace("(", "").length();
        int closeParenthese = logicExpression.length() - logicExpression.replace(")", "").length();
        
        if (!(openParenthese - closeParenthese == 0)){
            throw new ValidateExpressionException ("O Numero de parenteses não está correto");
        }
        return true;
    }

    //if the expression don't contains terms
    public boolean validateExpressionWithTerms(String logicExpression) throws ValidateExpressionException {
        if (!logicExpression.contains("T") && !logicExpression.contains("F")){
             throw new ValidateExpressionException ("A Expressão não contém termos");
        }
        
        return true;
    }

    //if the expression start with an operand
    public boolean validateExpressionStarDifferentOfOperand(String logicExpression) throws ValidateExpressionException {
        List valuesAcept = Arrays.asList(new String[]{"~", "(", "T", "F"});
        String firstCharachter = Character.toString(logicExpression.charAt(0));
        
        if (!valuesAcept.contains(firstCharachter)){
             throw new ValidateExpressionException ("Operação iniciada de forma incorreta");
        }
        
        return true;
    }

    //if the expression has two or more terms in sequence
    public boolean validateExpessionWithoutTwoOrMoreTermsInSequence(String logicExpression) {
        List<String> valuesNotAcept = Arrays.asList(new String[]{"TT", "FF", "TF", "FT"});
        boolean result = true;
        for (String value : valuesNotAcept) {
            if (logicExpression.contains(value)) {
                result = false;
            }
        }

        return result;
    }

    //if the expression has two or more operands in sequence
    public boolean validateExpressionWithoutTwoOrMoreOperandsInSequence(String logicExpression) throws ValidateExpressionException {
       
        for (int i = 0; i < logicExpression.length() - 1; i++) {
            if (logicExpression.charAt(i) != '~' && logicExpression.charAt(i) != '(' && logicExpression.charAt(i) != ')') {
                if (logicExpression.charAt(i) == logicExpression.charAt(i + 1)) {
                    throw new ValidateExpressionException ("A Expressão contem operandos ou termos em sequência");
                }
            }
        }
        return true;
    }

    //if the expression contains parentheses bad closed 
    //if the expression is incomplete
    public boolean validateCompleteExpression(String logicExpression) throws ValidateExpressionException {
        

        List valuesNotAcepts = Arrays.asList(new Character[]{'~', '<', '-', '^', 'V'});
        if (valuesNotAcepts.contains(logicExpression.charAt(logicExpression.length() - 1))) {
            throw new ValidateExpressionException("Expresssão finalizada de maneira Inválida");
        }
        valuesNotAcepts = Arrays.asList(new String[]{"~)", "<)", "-)", "^)", "V)", "()"});

        for (Object value : valuesNotAcepts) {
            if (logicExpression.contains(String.valueOf(value))) {
                throw new ValidateExpressionException("Expresssão finalizada de maneira Inválida");
            }
        }

        return true;
    }

    //if the expression has parentheses empties or with only operands or only terms
    public boolean validateContentsInsideOfParentheses(String logicExpression) throws ValidateExpressionException {
        String valuesInsideParents = "";
        List<String> operandsAcepts = Arrays.asList(new String[]{"~", "<", "-", "^", "V"});
       

        for (int i = 0; i < logicExpression.length() - 1; i++) {
            if (logicExpression.charAt(i) == '(') {
                for (int j = i; j < logicExpression.length() - 1 && logicExpression.charAt(j) != ')'; j++) {
                    valuesInsideParents += logicExpression.charAt(j + 1);
                }

                if ((!valuesInsideParents.contains("T") && !valuesInsideParents.contains("F")) || (valuesInsideParents.isEmpty())) {
                    throw new ValidateExpressionException ("A Expressão está mal formada");
                    
                }
                
                //refazer para avaliar quantidade de termos presentes no parenteses
                for (String operand : operandsAcepts) {
                    if (valuesInsideParents.contains(operand)) {
                       
                    }
                }
            }
        }
        return true;
    }

    //if the expression has one 'not' before or after of a operand
    public boolean validateOperandNotInCorrectPosition(String logicExpression) throws ValidateExpressionException {
        List<String> valueAcepts = Arrays.asList(new String[]{"~", "T", "F", "("});
       
        for (int i = 0; i < logicExpression.length() - 2; i++) {
            if (logicExpression.charAt(i) == '~') {
                if (!valueAcepts.contains(String.valueOf(logicExpression.charAt(i + 1)))) {
                     throw new ValidateExpressionException ("A Expressão está mal formada");
                }
            }
        }

        return true;
    }

}

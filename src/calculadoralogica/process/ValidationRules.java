/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralogica.process;

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

    public boolean validateLogicExpression(String logicExpression) {
        
        if (logicExpression.isEmpty()) {
            throw new RuntimeException("This expression is empty");
        }
        

        return true;
    }
}

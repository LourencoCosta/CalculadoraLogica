/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import structures.Stack;

/**
 *
 * @author rlc
 */
public class Testes {
    public static void main(String [] args){
     String x = "Os nomes das classes em Java precisam começar com letra e depois desta quaisquer combinações de letras e dígitos.";   
	int total = x.replaceAll("[^a]", "").length();
	System.out.println(total);
      
    }    
}

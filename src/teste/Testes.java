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
      Stack pilha = new Stack(5);
      pilha.push("0");
      pilha.push("1");
      pilha.push("3");
      pilha.push("4");
      pilha.push("5");
      
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
      
    }    
}

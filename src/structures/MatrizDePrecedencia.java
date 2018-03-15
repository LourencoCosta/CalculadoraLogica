/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author rlc
 */
public class MatrizDePrecedencia {
   
    public  static final boolean verficaMatrizDeprec(int stackTop, int valueLast){
        final boolean[][] precedencyOfMatrix = { {false, false, false, false, false, false, true}, 
                                                  {false, false, true, true, true, true, true}, 
                                                  {false, false, true, true, true, true, true}, 
                                                  {false, false, false, true, true, true, true}, 
                                                  {false, false, false, false, true, true, true},
                                                  {false, false, false, false, true, true, true},
                                                  {false, false, false, false, false, false, false}};
        return precedencyOfMatrix[stackTop][valueLast];
    }
}

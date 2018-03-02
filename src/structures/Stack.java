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
public class Stack {

    private int lengthOfStack;
    private String[] stackOfItems;
    private int posisitionFirstOut = -1;
    private int countItems;
    /**
     * @param length value deducted starting of send of parameter for user of
     * program
     * @throws UnsupportedOperationException
     */
    public Stack(int lengthOfStack) throws UnsupportedOperationException {
        this.lengthOfStack = lengthOfStack;
        if (lengthOfStack <= 0) {
            throw new UnsupportedOperationException("Invalid Value, please insert a valid value between 1 and 100");
        }
        stackOfItems = new String[lengthOfStack];
    }

    public boolean push(String parameterStacked) {
       this.posisitionFirstOut++;
       this.stackOfItems[posisitionFirstOut] = parameterStacked;
       
       return true;
    }

    public String pop() {
        String itemPoped = this.stackOfItems[posisitionFirstOut];
        this.stackOfItems[posisitionFirstOut] = null;

        posisitionFirstOut--;
        return itemPoped;
    }

    public int getlength() {
        return this.lengthOfStack;
    }
}

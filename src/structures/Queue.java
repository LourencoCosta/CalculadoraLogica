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
public class Queue {

    String[] queueOut;
    Integer lengthOfQueue;
    int last = -1;

    public Queue(int lengthOfQueue) {
        this.lengthOfQueue = lengthOfQueue;
        if (lengthOfQueue <= 0) {
            throw new UnsupportedOperationException("Invalid Value, please insert a valid value between 1 and 100");
        }
        queueOut = new String[lengthOfQueue];
    }

    public void insert(String insertValue) {
        last++;
        queueOut[last] = insertValue;

    }

    public void remove() {
        for (int i = 0; i < last; i++) {
            queueOut[i] = queueOut[i + 1];
        }

        queueOut[last] = null;
        last--;
    }

    public String getValue() {
        return queueOut[0];
    }
    public boolean isEmpty(){
        return queueOut[0] == null;
    }
    
    public static void main(String[] args){
//        Queue q = new Queue(5);
        //System.out.println(q.isEmpty());
    }
}

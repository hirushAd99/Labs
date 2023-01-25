/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuesoperations;

/**
 *
 * @author 2019e166
 */
public class testQueues {
    public static void main(String[] args) {
        QueuesOperations queuesObject = new QueuesOperations();
        int[] queuesArray = new int[10];
        queuesArray[0] = 12;
        queuesArray[1] = 89;
        queuesArray[2] = 55;
        queuesArray[3] = 69;
        queuesArray[4] = 33;
        queuesArray[5] = 84;
        queuesObject.QueuesOperations(queuesArray, 10,5);
        queuesObject.peek();
        queuesObject.enqueue(55);
        queuesObject.peek();
        queuesObject.dequeue();
        queuesObject.peek();
    }
    
}

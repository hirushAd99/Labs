/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;
import java.util.ArrayList;
/**
 *
 * @author 2019e166
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(8);
        
        // Add elements
        myList.add(67);
        myList.add(23);
        myList.add(66);
        myList.add(90);
        myList.add(88);
        
        // get elements.
         
        System.out.println("1st index element : "+myList.get(1));
        
        // Print array Size
        System.out.println("Size : "+myList.size());
        
        // Remove element
        myList.remove(4);  // Remove 4th index element.
        
        // Change the element value.
        
        myList.set(0, 25);
        
        for(int i =0; i<myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
        
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchcommonelements;
import java.util.ArrayList;
/**
 *
 * @author 2019e166
 */
public class SearchCommonElements {

    /**
     * @param args the command line arguments
     */
    static void searchCommonElements(ArrayList<Integer> myList01 , ArrayList<Integer> myList02)
    {
       ArrayList<Integer> commonElement = new ArrayList<Integer>(10);
        for(int i =0; i < myList01.size(); i++)
        {
            for(int j = 0; j < myList02.size(); j++)
            {
                if(myList01.get(i) == myList02.get(j))
                {
                    //commonElement.add(myList01[i]);
                }
            }
        }
        System.out.print("{");
        for(int k = 0; k<commonElement.size(); k++)
        {
            System.out.print(commonElement.get(k)+", ");
        }
        System.out.print(" }");
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList01 = new ArrayList<Integer>(5);
        myList01.add(12);
        myList01.add(24);
        myList01.add(56);
        myList01.add(10);
        myList01.add(98);
        int[] arrayOne = new int[]{34,56,54,32,78,90,87};
        int[] arrayTwo = new int[]{56,23,90,78,44,70,41};
        searchCommonElements(arrayOne, arrayTwo);
        // TODO code application logic here
    }
    
}

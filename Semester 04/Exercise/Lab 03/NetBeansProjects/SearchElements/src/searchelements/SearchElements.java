/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchelements;
import java.util.ArrayList;
/**
 *
 * @author 2019e166
 */
public class SearchElements {
    
    static void searchElementsInArray(ArrayList<String> arrayList, String searchElement)
    {
        boolean isFound = false;
        for(int i=0; i<arrayList.size();i++)
        {
            if(arrayList.get(i) == searchElement)
            {
                System.out.println(searchElement);
                isFound = true;
            }
        }
        if(isFound == false)
        {
            System.out.println("Element not founded.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrayListElement = new ArrayList<String>();
        arrayListElement.add("Red");
        arrayListElement.add("Green");
        arrayListElement.add("Orange");
        arrayListElement.add("White");
        arrayListElement.add("Black");
        System.out.println("For search Red : ");
        searchElementsInArray(arrayListElement, "Red");
        System.out.println("For search Blue : ");
        searchElementsInArray(arrayListElement, "Blue");
        // TODO code application logic here
    }
    
}

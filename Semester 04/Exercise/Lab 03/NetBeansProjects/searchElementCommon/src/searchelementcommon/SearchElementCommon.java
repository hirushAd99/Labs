/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchelementcommon;

/**
 *
 * @author 2019e166
 */
public class SearchElementCommon {

    /**
     * @param args the command line arguments
     */
    static void searchCommonElements(int[] arrayOne, int[] arrayTwo)
    {
        System.out.print("{");
        int[] equalElements = new int[5];
        for(int i =0; i<arrayOne.length; i++)
        {
            for(int j = 0; j < arrayTwo.length; j++)
            {
                if(arrayOne[i] == arrayTwo[j])
                {
                    System.out.print(arrayOne[i] + ",");
                }
            }
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        int[] arrayOne = new int[]{23,56,34,12,67};
        int[] arrayTwo = new int[]{56,78,65,34,23};
        searchCommonElements(arrayOne, arrayTwo);
        // TODO code application logic here
    }
    
}

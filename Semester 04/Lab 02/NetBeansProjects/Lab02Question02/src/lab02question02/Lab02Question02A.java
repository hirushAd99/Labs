/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02question02;

/**
 *
 * @author 2019e166
 */
public class Lab02Question02A {

    /**
     * @param args the command line arguments
     */
    
    public static int binarySearch(long searchKey,int[] numberArray)
    {
        int lowerBoundOfSearch = 0;
        int upperBoundOfSearch = numberArray.length-1;
        int checkingIndex = 0;
        while(true)
        {
            checkingIndex = (lowerBoundOfSearch+upperBoundOfSearch)/2;
            if(numberArray[checkingIndex] == searchKey)
            {
                return  checkingIndex;
            }
            else if(lowerBoundOfSearch > upperBoundOfSearch)
            {
                return numberArray.length-1;
            }
            else 
            {
                if(numberArray[checkingIndex] < searchKey)
                {
                    lowerBoundOfSearch = checkingIndex + 1;
                }
                else
                {
                    upperBoundOfSearch = checkingIndex -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numberArray = {3,56,32,33,45,90};
        //numberArray = {};
        binarySearch(45, numberArray);
        // TODO code application logic here
    }
    
}
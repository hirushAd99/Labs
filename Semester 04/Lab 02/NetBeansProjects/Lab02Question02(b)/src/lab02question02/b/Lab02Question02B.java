/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02question02.b;
public class Lab02Question02B {

    /**
     * @param args the command line arguments
     */
    public static int binarySearch(int searchNumber , int[] numberArray , int startIndex , int endIndex)
    {
        int middleIndex = (startIndex + endIndex)/2;
        if(searchNumber == numberArray[middleIndex])
        {
            System.out.println("Middle index : " + middleIndex);
            return middleIndex;
        }
        else if(searchNumber < numberArray[middleIndex])
        {
            startIndex = 0;
            endIndex = middleIndex;
            return (binarySearch(searchNumber, numberArray, startIndex, endIndex));
        }
        else if(searchNumber < numberArray[middleIndex])
        {
            startIndex = middleIndex;
            endIndex = numberArray.length-1;
            return (binarySearch(searchNumber, numberArray, startIndex, endIndex));
        }
        return -1;
    }
    public static void main(String[] args) {
         int[] numberArray = {3,56,32,33,45,90,89};
 
        binarySearch(33, numberArray, 0, numberArray.length-1);
        // TODO code application logic here
    }
    
}

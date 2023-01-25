package maxmimumoccurrance;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;
public class MaxmimumOccurrance {
    ArrayList<Character> HashTableElement = new ArrayList<Character>();
    int countingArray[][] = new int[128][2];
    Scanner scanner = new Scanner(System.in);
    String inputString;
    // Default constructor.
    public void setElements()
    {
        System.out.println("Enter the word : ");
        inputString = scanner.nextLine();
        for(int k =0; k<128;k++)
        {
            countingArray[k][1] = k;
        }

    }
    // setHashTableElement method for setting HashTableElement array list.
    public void setHashTableElement()
    {
        for(int i =0; i<inputString.length(); i++)  // Adding element by element into array list.
        {
            HashTableElement.add(i,inputString.charAt(i));
            inputString.indexOf(i);
        }
    }

    public void customHashTable()
    {
        for(int i =0; i<HashTableElement.size(); i++)
        {
            int tempValue = HashTableElement.get(i)%127;
            countingArray[tempValue][1] = countingArray[tempValue][1]+1;
        }
    }

    public void findMaximum()
    {
        int maxmimum = Integer.compareUnsigned(0, 1);
        for(int i =0; i<HashTableElement.size();i++)
        {
            if(maxmimum < countingArray[i][1])
            {
                maxmimum = countingArray[i][1];
            }
        }
        System.out.println("maximum : "+countingArray[maxmimum][1]);
        System.out.println(countingArray[maxmimum][0]);
        int temp = countingArray[maxmimum][0];
        System.out.println(temp);
    }

    public static void main(String[] args) {
        MaxmimumOccurrance newObject = new MaxmimumOccurrance();
        newObject.setElements();
        newObject.setHashTableElement();
        newObject.customHashTable();
        newObject.findMaximum();
    }
}

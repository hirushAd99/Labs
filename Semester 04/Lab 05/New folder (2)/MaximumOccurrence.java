import java.util.ArrayList;
import java.util.Scanner;

/**
 *  MaximumOccurrence method use for store the char values in array list.
 */
public class MaximumOccurrence {
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
            countingArray[k][0] = k;
        }

    }

    /**
     * setHashTableElement method use for set elements in hash table.
     */
    // setHashTableElement method for setting HashTableElement array list.
    public void setHashTableElement()
    {
        for(int i =0; i<inputString.length(); i++)  // Adding element by element into array list.
        {
            HashTableElement.add(i,inputString.charAt(i));
            inputString.indexOf(i);
        }
    }

    /**
     * customHashTable method use to add the char values to hash table according to the ascii value.
     */
    public void customHashTable()
    {
        for(int i =0; i<HashTableElement.size(); i++)
        {
            int tempValue = HashTableElement.get(i)%127;
            countingArray[tempValue][1] = countingArray[tempValue][1]+1;
        }
    }

    /**
     * findMaximum method use to find the maximum number of element
     */
    public void findMaximum()
    {
        int maximum = countingArray[0][1];
        int maximumIndex = countingArray[0][0];
        for(int i =0; i<128;i++)
        {
            if(maximum < countingArray[i][1])
            {
                maximumIndex = countingArray[i][0];
                maximum = countingArray[i][1];
            }
        }
        char tempChar = (char) countingArray[maximumIndex][0];
        int temp = countingArray[maximum][0];
        System.out.println("Maximum occurrence : ");
        System.out.print(tempChar + "  "+temp);
    }

    /**
     * main method use for create objects and calling methods.
     * @param args
     */
    public static void main(String[] args) {
        MaximumOccurrence newObject = new MaximumOccurrence();
        newObject.setElements();
        newObject.setHashTableElement();
        newObject.customHashTable();
        newObject.findMaximum();
    }
}

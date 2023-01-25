import java.util.Scanner;
public class CircularLinkedList {
    Scanner scanner = new Scanner(System.in);
    int numberOfPeople;
    int numberCountingOff;
    int n = 0;
    int[] arrayElement = new int[numberOfPeople];
    int[] temporaryArray = new int[n];

    public CircularLinkedList()
    {
        numberOfPeople = 0;
        numberCountingOff = 0;
    }
    public void setElement()
    {
        System.out.println("Enter the number of people in the circle (n) : ");
        numberOfPeople = scanner.nextInt();
        System.out.println("Enter the number used for counting off (m) :");
        numberCountingOff = scanner.nextInt();
        int[] buildArray = new int[numberOfPeople];
        for(int i =0; i < numberOfPeople;i++)
        {
            buildArray[i] = i+1;
        }
        arrayElement = buildArray;
        n = numberOfPeople;
        temporaryArray = buildArray;
    }
    public void committedSuicide()
    {
        for(int i = 0; i <numberOfPeople; i+=numberCountingOff)  // i <numberOfPeople-1
        {
            if((i+numberCountingOff-1) < numberOfPeople)
            {
                System.out.print(temporaryArray[i+numberCountingOff-1] + "  ");
                //arrayElement[i+numberCountingOff-1] = 0;
                arrayElement[temporaryArray[i+numberCountingOff-2]] = 0;
                n++;
            }
        }
        System.out.println();
        int k = 0;
        for(int j = 0; j < (numberOfPeople-1); j++)
        {
            if(arrayElement[j] != 0)
            {
                System.out.print(arrayElement[j] + " ");
                temporaryArray[k] = arrayElement[j];
                k++;
            }
        }
        System.out.println();
        if(temporaryArray.length != 1)
        {
            committedSuicide();
        }
        else
        {
            System.out.println(temporaryArray[0]);
        }

    }
    public void countOffAroundCircle(int startingIndex)
    {
        for(int i =0; i<numberOfPeople-1;i++)
        {

        }
    }

    public static void main(String[] args) {
        CircularLinkedList newObject = new CircularLinkedList();
        newObject.setElement();
        newObject.committedSuicide();
    }
}

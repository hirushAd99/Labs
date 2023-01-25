import java.util.Scanner;    // Import scanner library.
import java.util.ArrayList;  // Import ArrayList library.
public class DelimitersMatching {
    String delimiter;   // Define delimiter.
    Scanner scanner = new Scanner(System.in);    // Create object of scanner.
    public void DelimitersMatching()     // Default constructor.
    {
        delimiter = " ";
    }
    public void setDelimiter()        // setDelimiter method for setting elements.
    {
        System.out.print("Enter : ");     // Take the input from user.
        delimiter = scanner.nextLine();
    }

    // setCharacters method for passing to array.
    public void setCharacters()
    {
        int delimiterLength = delimiter.length();
        ArrayList<Character> myList = new ArrayList<Character>();
        char characters = '+';  // Default char value.
        int index = -1;
        for(int i =0; i<delimiter.length();i++)
        {
            characters = delimiter.charAt(i);
            if((characters == '{')||(characters == '[')||(characters == '('))  // Check the required character available or not.
            {
                index++;
                myList.add(index,characters);

            }
            else if((characters == '}')||(characters == ']')||(characters == ')'))  // Check with the elements at the last of list.
            {
                if(characters == '}')
                    characters = '{';
                else if(characters == ')')
                    characters = '(';
                else
                    characters = '[';
                if(myList.get(index) != characters)  // If not equal this will print.
                {
                    System.out.println("Error "+myList.get(index) +" "+characters + " on delimiter.");
                    return;
                }
                else
                {
                    index--;
                }
            }
        }
        System.out.println("Delimiter matching properly.");   // If delimiter match properly this will come.
    }
    public static void main(String[] args) {
        DelimitersMatching newObject = new DelimitersMatching();  // Create an object.
        newObject.setDelimiter();    // Calling setDelimiter method.
        newObject.setCharacters();   // Calling setCharacters method.
    }
}

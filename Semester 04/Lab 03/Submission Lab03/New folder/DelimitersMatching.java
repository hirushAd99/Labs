import java.util.Scanner;
import java.util.ArrayList;
public class DelimitersMatching {
    String delimiter;
    Scanner scanner = new Scanner(System.in);
    public void DelimitersMatching()
    {
        delimiter = " ";
    }
    public void setDelimiter()
    {
        System.out.print("Enter : ");
        delimiter = scanner.nextLine();
    }

    public void setCharacters()
    {
        int delimiterLength = delimiter.length();
        ArrayList<Character> myList = new ArrayList<Character>();
        char characters = '+';
        int index = -1;
        for(int i =0; i<delimiter.length();i++)
        {
            characters = delimiter.charAt(i);
            if((characters == '{')||(characters == '[')||(characters == '('))
            {
                index++;
                myList.add(index,characters);

            }
            else if((characters == '}')||(characters == ']')||(characters == ')'))
            {
                if(characters == '}')
                    characters = '{';
                else if(characters == ')')
                    characters = '(';
                else
                    characters = '[';
                if(myList.get(index) != characters)
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
        System.out.println("Delimiter matching properly.");
    }

}

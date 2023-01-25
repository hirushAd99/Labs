import java.util.Scanner;
public class ReverseWord {
    String word;
    Scanner scanner = new Scanner(System.in);
    public void ReverseWord()
    {
        word = "WORD";
    }
    public void ReverseWord(String word)
    {
        this.word = word;
        setCharactersArray(word);
    }
    public void setWord()
    {
        System.out.print("Enter the word : ");
        word = scanner.nextLine();
        setCharactersArray(word);
    }
    public void setCharactersArray(String word)
    {
        char[] characters = new char[word.length()];
        for(int i =0; i<word.length(); i++)
        {
            characters[i] = word.charAt(i);
        }
        printWord(characters);
    }

    public void printWord(char[] characters)
    {
        for(int j = characters.length-1; j>=0; j--)
        {
            System.out.print(characters[j]);
        }
    }
}

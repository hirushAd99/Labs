import java.util.Scanner;  // Import scanner library.
public class ReverseWord {
    String word;     // Define word.
    Scanner scanner = new Scanner(System.in);  // Create object of scanner.
    public void ReverseWord()    // Default constructor.
    {
        word = "WORD";
    }
    public void ReverseWord(String word)   // Default constructor for setting values.
    {
        this.word = word;
        setCharactersArray(word);
    }
    // setWord method to set a word.
    public void setWord()
    {
        System.out.print("Enter the word : ");
        word = scanner.nextLine();
        setCharactersArray(word);
    }
    // setCharactersArray method to take characters to array.
    public void setCharactersArray(String word)
    {
        char[] characters = new char[word.length()];
        for(int i =0; i<word.length(); i++)
        {
            characters[i] = word.charAt(i);
        }
        printWord(characters);
    }

    // printWord method to reverse the word.
    public void printWord(char[] characters)
    {
        for(int j = characters.length-1; j>=0; j--)
        {
            System.out.print(characters[j]);
        }
    }

    public static void main(String[] args) {
        ReverseWord newObject = new ReverseWord();  // Crate an object of ReverseWord class.
        newObject.setWord();    // Calling setWord method.
    }
}

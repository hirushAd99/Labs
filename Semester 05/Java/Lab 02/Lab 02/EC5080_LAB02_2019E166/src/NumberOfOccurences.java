import java.util.*;

public class NumberOfOccurences {
    Scanner scanner = new Scanner(System.in);
    public void divideWord()
    {
        System.out.println("Enter the sentence : ");
        String sentence = scanner.nextLine();
        String[] word = sentence.split(" ");
        HashMap<String,Integer> wordDetails = new HashMap<>();
        for (int i =0; i<word.length; i++)
        {
            String temp = word[i];
            wordDetails.put(temp,temp.length());
        }
        System.out.println(wordDetails);
    }

    public static void main(String[] args) {
        NumberOfOccurences object = new NumberOfOccurences();
        object.divideWord();
    }
}

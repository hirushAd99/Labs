//import necessary packages
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regularexp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Read Regex from user
            System.out.println("Enter the regex : ");
            String readRegex = scanner.next();
            //Create the pattern
            String patternString = "A";
            Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
            //Read the input string to check the match
            Matcher matcher = pattern.matcher(readRegex);
//Create a matcher
            boolean found = false;
            int j =0;
            while (matcher.find()) {
                System.out.println("I found the text "+ patternString + " starting at index "+ matcher.start()+ " and ending at index "+matcher.end()+".");

//Print as: I found the text "j" starting at index 0 and ending at index 1.
                found = true;
            }
            if(!found){
                System.out.println("Could not found.");
//Print
            }
        }
    }
}

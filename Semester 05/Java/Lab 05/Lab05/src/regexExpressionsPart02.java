import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexExpressionsPart02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Read Regex from user
            System.out.println("Enter the regex : ");
            String readRegex = scanner.next();
            //Create the patterns.
			//Part 01
            //String patternString = "Kr*"; 
			//Part 02
            //String patternString = "[aeiou]";
			//part 03
            String patternString = "@eng|@gmail|@fmf,@med";
            Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(readRegex);

            boolean found = false;
            int j =0;
            while (matcher.find()) {
                System.out.println("I found the text "+ patternString + " starting at index "+ matcher.start()+ " and ending at index "+matcher.end()+".");
                found = true;
            }
            if(!found){
                System.out.println("Could not found.");
            }
        }
    }
}


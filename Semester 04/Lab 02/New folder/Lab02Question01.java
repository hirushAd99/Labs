public class Lab02Question01 {
    // Triangular number
    public static int triangularNumber(int number)  // number variable is to provide the required triangular number.
    {
        if(number == 1) // Factorial of 1 is 1.
        {
            return 1;
        }
        else   // If input is higher than one the recursive will call for summation of number.
        {
            return (number+triangularNumber(number-1));  // Recursively call triangularNumber function.
        }
    }

    // Factorial.
    public static int factorial(int number) // Factorial method is here.
    {
        if(number > 1)  // Until 1 the recursive will run.
        {
            return (number * factorial(number -1));  // Recursively call the function.
        }
        else
        {
            return 1; // When it reaches 1 it will return 1.
        }
    }


    // Anagrams
    public static int anagramsMethod(String word , int n)  // Insert the word and calling the method for anagrams.
    {
        if(word.length()==1)  // If the word only have 1 letter can not do any change.
        {
            return 1;
        }
        for(int i =0; i<word.length(); i++)
        {
            n++;
            return (anagramsMethod(word,n));
        }

        return 0;
    }

    // Towers of Hanoi
    public static void towersOfHanoi(int top,char from,char inter, char to , int n) // Calling the method.
    {
        if(top == 1) // Check the changing disc is 1 or other.
        {
            System.out.println("Disk 1 From : "+from+" to " +to);
            n++;
        }
        else
        {
            n++;
            towersOfHanoi(top-1, from, to, inter,n);
            System.out.println("Disk "+top+" from : " + from +" to " + to);
            n++;
            towersOfHanoi(top-1, inter, from, to,n);
        }
    }
    public static void main(String[] args) {
        //int n = triangularNumber(5);
        //System.out.println(n);
        //int m = factorial(5);
        //System.out.println(m);
        //int s = anagramsMethod("hour",0);
        //System.out.println(s);
        towersOfHanoi(3, 'A', 'B', 'C',0);
    }
}

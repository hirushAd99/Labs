import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your roll number");
        int roll = s.nextInt();
        try {
            if (roll < 0) {
                throw new ArithmeticException(
                        "The number entered is not positive"
                );
            } else {
                System.out.println("Valid roll number");
            }
        } catch (ArithmeticException e) {
            System.out.println("An exception is thrown");
            System.out.println(e.getMessage());
        }
    }

}

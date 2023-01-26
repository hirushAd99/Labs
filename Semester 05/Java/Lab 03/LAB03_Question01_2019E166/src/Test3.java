import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = s.nextInt();
        try {
            if (age < 5) {
                throw new ArithmeticException(
                        "Not allowed! Your age is less than 5"
                );
            } else if (age > 20) {
                throw new ArithmeticException(
                        "Not allowed! Your age is greater than 20"
                );
            } else {
                System.out.println("Welcome!");
            }
        } catch (ArithmeticException e) {
            System.out.println("An exception is thrown");
            System.out.println(e.getMessage());
        }
    }


}

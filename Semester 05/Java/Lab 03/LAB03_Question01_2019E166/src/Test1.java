import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your roll number");
        int roll = s.nextInt();
        if (roll < 0) {
            throw new ArithmeticException("Roll number can't be negative");
        } else {
            System.out.println("Valid roll number");
        }
    }

}

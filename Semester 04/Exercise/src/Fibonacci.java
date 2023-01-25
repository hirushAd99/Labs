import java.util.Scanner;
public class Fibonacci {
    static void fibonacci(int n)
    {
        int total = 0;
        int n1 = 1;
        int n2 = 1;
        for(int i =0; i<n;i++)
        {
            if(i <2)
            {
                total = n1;
            }
            else
            {
                total = n1+n2;
                n1=n2;
                n2=total;
            }
            System.out.print(total + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number how many numbers need : ");
        int number = scanner.nextInt();
        fibonacci(number);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author 2019e166
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
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
        // TODO code application logic here
    }
    
}

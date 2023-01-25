/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02question01;

/**
 *
 * @author 2019e166
 */
public class Lab02Question01 {

    /**
     * @param args the command line arguments
     */
    public static int traiangularNumber(int number)
    {
        //int total = 0;
        if(number == 1)
        {
            return 1;
        }
        else
        {
            //total = total + number;
            return (number+traiangularNumber(number-1));
            //return total;
        }
    }
    
    public static int factorial(int number)
    {
        if(number > 1)
        {
            return (number * factorial(number -1));
        }
        else 
        {
            return 1;
        }
    }
    
    public static int anagramsMethod(String word)
    {
        if(word.length()==1)
        {
            return 1;
        }
        for(int i =0; i<word.length(); i++)
        {
            return (anagramsMethod(word));
        }
        
        return 0;
    }
    
    public static void towersOfHanoi(int top,char from,char inter, char to , int n)
    {
        if(top == 1)
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
        //System.out.println("Number : " + n);
    }
    public static void main(String[] args) {
        int n = traiangularNumber(5);
        System.out.println(n);
        int m = factorial(5);
        System.out.println(m);
        //int s = anagramsMethod("Hiru");
        //System.out.println(s);
        towersOfHanoi(2, 'A', 'B', 'C',0);
        // TODO code application logic here
    }
    
}

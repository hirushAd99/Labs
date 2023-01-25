/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countcharacter;

/**
 *
 * @author 2019e166
 */
public class CountCharacter {

    /**
     * @param args the command line arguments
     */
    static void countCharactersInString(String word)
    {
        char[] characters = new char[word.length()];
        for(int i =0; i<word.length();i++)
        {
            characters[i] = word.charAt(i);
        }
        /*
        for(int j =0; j<word.length(); j++)
        {
            System.out.print(characters[j]);
        }*/

        for(int j =0; j <characters.length; j++)
        {
            int n = 1;
            for(int k = j+1; k < characters.length; k++)
            {
                if(characters[j] == characters[k])
                {
                    n++;
                }
            }
            System.out.print(characters[j] +" = "+ n +" ");
        }
    }
    public static void main(String[] args) {
        countCharactersInString("JAVA HUNGRY");
        // TODO code application logic here
    }
    
}

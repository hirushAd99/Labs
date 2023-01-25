public class CountOccurrences {
    static void countCharactersInString(String word)
    {
        char[] characters = new char[word.length()];
        for(int i =0; i<word.length();i++)
        {
            characters[i] = word.charAt(i);
        }
        for(int j =0; j <characters.length; j++)
        {
            int n = 0;
            for(int k = 0; k < characters.length; k++)
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
        countCharactersInString("JAVAHUNGRY");
    }
}

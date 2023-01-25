public class FindCommonElements {
    static void searchCommonElements(int[] arrayOne, int[] arrayTwo)
    {
        System.out.print("{");
        int[] equalElements = new int[5];
        for(int i =0; i<arrayOne.length; i++)
        {
            for(int j = 0; j < arrayTwo.length; j++)
            {
                if(arrayOne[i] == arrayTwo[j])
                {
                    System.out.print(arrayOne[i] + ",");
                }
            }
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        int[] arrayOne = new int[]{23,56,34,12,67};
        int[] arrayTwo = new int[]{56,78,65,34,23};
        searchCommonElements(arrayOne, arrayTwo);
    }
}

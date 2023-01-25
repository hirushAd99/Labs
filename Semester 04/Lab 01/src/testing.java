public class testing {
    public static void main(String[] args) {
        int[] elementArray = new int[5];
        elementArray[0] = 90;
        elementArray[1] = 99;
        elementArray[2] = 56;
        elementArray[3] = 70;
        elementArray[4] = 23;
        /*
        for(int i =0; i< elementArray.length; i++)
        {
            for(int j = 0; j < elementArray.length-1; j++)
            {
                if(elementArray[j] > elementArray[j+1])
                {
                    int temp = elementArray[j];
                    elementArray[j] = elementArray[j+1];
                    elementArray[j+1] = temp;
                }
            }
        }

         */
        for(int i =0; i < elementArray.length-1; i++)
        {
            int minValue = i;
            for(int j =i+1; j< elementArray.length; j++)
            {
                if(elementArray[j] < elementArray[minValue])
                {
                    minValue = j;
                }
            }
            if(minValue != i)
            {
                int tempValue = elementArray[i];
                elementArray[i] = elementArray[minValue];
                elementArray[minValue] = tempValue;
            }
        }
        for(int k =0; k< elementArray.length; k++)
        {
            System.out.println(elementArray[k]);
        }
    }
}

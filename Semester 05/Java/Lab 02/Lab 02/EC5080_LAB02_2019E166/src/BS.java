//https://big-o.io/examples/bubble-sort/java-generic/ - get the idea for object comparison.
public class BS {
    public static<E extends Comparable<E>> void BS(E [] arr)
    {
        boolean Pass = true; //fill
        int n = arr.length;
        for (int i = 0; i < n && Pass; i++)
        {
            Pass = true; //fill
            for (int j = 0; j < n - i-1; j++)
            {
               if ((arr[j].compareTo(arr[j+1]) > 0))
                {
                    swap(j,j+1,arr);
                    Pass = true;
                }
            }
        }
    }
    public static void swap(int i , int j,Object [] arr)
    {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(Object arr[])
    {
        int i = 0;
        while(i < arr.length)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer[] intArray = {34,6,7,5,32,77,78,55};
        Double[] doubleArray = {5.7,89.8,43.0,42.5,2.4,1.5};
        String[] stringArray = {"alpha","gamma","beta","delta"};
        BS(intArray);
        BS(doubleArray);
        BS(stringArray);
        print(intArray);
        print(stringArray);
        print(doubleArray);
    }
}

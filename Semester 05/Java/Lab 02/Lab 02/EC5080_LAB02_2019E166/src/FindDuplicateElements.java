// I certify the code of this lab is entirely my own work, but I referred the lecture notes attached.
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] data = {11,34,22,67,11,3,54,13,34,90,3,46};
        Set<Integer> set = new LinkedHashSet<Integer>();
        Set<Integer> duplicateSet = new LinkedHashSet<Integer>();
        int j = 0;
        for(int i =0; i< data.length; i++)
        {
            set.add(data[i]);
            if((j+1) == set.size())
            {
                j++;
            }
            else
            {
                duplicateSet.add(data[i]);
            }

        }
        System.out.println(set);
        System.out.println("Duplicate : "+duplicateSet);
    }
}

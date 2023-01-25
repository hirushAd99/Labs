import java.util.ArrayList;
public class SearchElement {
    static void searchElementsInArray(ArrayList<String> arrayList, String searchElement)
    {
        boolean isFound = false;
        for(int i=0; i<arrayList.size();i++)
        {
            if(arrayList.get(i) == searchElement)
            {
                System.out.println(searchElement);
                isFound = true;
            }
        }
        if(isFound == false)
        {
            System.out.println("Element not founded.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayListElement = new ArrayList<String>();
        arrayListElement.add("Red");
        arrayListElement.add("Green");
        arrayListElement.add("Orange");
        arrayListElement.add("White");
        arrayListElement.add("Black");
        System.out.println("For search Red : ");
        searchElementsInArray(arrayListElement, "Red");
        System.out.println("For search Blue : ");
        searchElementsInArray(arrayListElement, "Blue");
    }
}

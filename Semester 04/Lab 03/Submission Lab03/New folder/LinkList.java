import java.util.ArrayList;
public class LinkList {
    ArrayList<Integer> linkListArrayList = new ArrayList<Integer>();
    int linkListIndex ;
    public void LinkList()
    {

    }
    public void appendNewNode(int newElement)
    {
        linkListArrayList.add(linkListIndex,newElement);
        linkListIndex++;
    }
    public void prependNewNode(int newElement)
    {
        for(int i =linkListIndex; i>=0; i--)
        {
            linkListArrayList.add(linkListIndex+1,linkListArrayList.get(linkListIndex));
            linkListIndex--;
        }
    }
    public void deleteAtStart()
    {
        for(int i = 0; i<linkListIndex;i++)
        {
            linkListArrayList.add(i,linkListArrayList.get(i+1));
        }
    }

    public void deleteAtSpecificPosition(int indexForDelete)
    {
        for(int i = indexForDelete; i<linkListIndex; i++)
        {
            linkListArrayList.add(i,linkListArrayList.get(i+1));
        }
    }

}

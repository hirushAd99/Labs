/** I certify the code of this lab is entirely my own work,
 * https://www.geeksforgeeks.org/sort-string-characters/ this helps to get an idea about sorting strings.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Cards {

    LinkedList cards = new LinkedList<String>();

    public void setCards(Object[] cardsArray)
    {
        for(int i =0; i<cardsArray.length; i++)
        {
            cards.add(cardsArray[i]);
        }
        System.out.println("Added");
    }
    public void SortTheCard(Object[] cardsArray)
    {
        Arrays.sort(cardsArray,0,(cardsArray.length));
        System.out.println("Sorted card : ");
        for(int i =0; i<cardsArray.length; i++)
        {
            System.out.print(cardsArray[i] + " ");
        }
        System.out.println();
    }


    public void shuffleTheCards()
    {
        System.out.println("Shuffle the cards : ");
        for(int i =0; i<cards.size(); i++)
        {
            int s = new Random().nextInt(cards.size());
            System.out.print(cards.get(s) + " ");
        }
        System.out.println();
    }

    public void reverseTheCards()
    {
        System.out.println("Reverse Order : ");
        for (int i = cards.size(); i>0; i--)
        {
            System.out.print(cards.get(i-1)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] cardArray = {"ClubsA","SpadeK","HeartsQ","DiamondJ","Clubs10","Spade9","Hearts8","Diamond7","Clubs" +
                "6", "Spade5","Hearts4","Diamond3"};
        Cards object = new Cards();
        object.setCards(cardArray);
        object.SortTheCard(cardArray);
        object.shuffleTheCards();
        object.reverseTheCards();
        object.shuffleTheCards();
    }
}

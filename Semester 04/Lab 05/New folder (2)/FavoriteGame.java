 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritegame;
import java.util.*;

/**
 *
 * @author 2019e166
 */
public class FavoriteGame {
    int numberOfEntries;
    HashMap<String,String> hashtable = new HashMap<String,String>(numberOfEntries);
    HashMap<String,Integer> hashtableCount = new HashMap<String,Integer>(numberOfEntries);
    Scanner scanner = new Scanner(System.in);

    /**
     * @setNumberOfEntries is for setting the number of entries.
     */
    public void setNumberOfEntries()
    {
        System.out.print("Enter number of entries : ");
        numberOfEntries = scanner.nextInt();
    }

    /**
     * @setHashtable use for setting elements to hash map.
     */
    public void setHashmap()
    {
        for (int i =0; i<numberOfEntries; i++) {
            String nameString = scanner.next();
            String gameString = scanner.next();
            hashtable.put(nameString,gameString);
        }
    }

    /**
     * Count the elements and add them to hash map.
     */

    public void countElement()
    {
        for(String elements : hashtable.values())
        {
            if(hashtableCount.containsKey(elements))
            {
                int count = hashtableCount.get(elements);
                count= count+1;
                hashtableCount.put(elements,count);
            }
            else
            {
                hashtableCount.put(elements,1);
            }
        }
    }

    /**
     * Find the maximum count of the favorite game and football count.
     */

    public void findMax()
    {
        int maxCount = 0;
        String maxLikeGameName = " ";
        for(String element : hashtableCount.keySet())
        {
            int gameCount = hashtableCount.get(element);
            if(maxCount <= gameCount)
            {
                maxCount = gameCount;
                maxLikeGameName = element;
            }
        }
        System.out.println(maxLikeGameName);
        System.out.println("Football : " + hashtableCount.get("football"));

    }

    /**
     * @printFootballCount use to get number of people who likes football.
     */


    /**
     * @param args the command line arguments
     * @main for creating an object and calling methods.
     */
    public static void main(String[] args) {
        FavoriteGame favoriteGame = new FavoriteGame();
        favoriteGame.setNumberOfEntries();
        favoriteGame.setHashmap();
        favoriteGame.countElement();
        favoriteGame.findMax();
    }
    
}

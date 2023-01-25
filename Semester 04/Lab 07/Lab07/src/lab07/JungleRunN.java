package lab07;

import java.util.ArrayList;
import java.util.Scanner;

public class JungleRunN {
        int mapSize;
        Scanner scanner = new Scanner(System.in);
        //int currentPlaceIndex01 = 0;
        //int currentPlaceIndex02 = 0;
        int lengthOfPath = 900;
        ArrayList<String> pathElementList = new ArrayList<>();
        String[][] mapElements = setMapElements(mapSize);

        /**
         * For set mapSize variable and calling setMapElements.
         */
        public void setMapSize()
        {
            System.out.println("Enter the map size : ");
            mapSize = scanner.nextInt();
            mapElements = setMapElements(mapSize);
            ArrayList<String> tempPath = new ArrayList<>(0);
            findPathN(tempPath,mapSize);

        }

        /**
         * setMapElements use for set elements into 2D array.
         * @param mapSize
         * @return
         */
        public String[][] setMapElements(int mapSize)
        {
            String[][] mapElementsN = new String[mapSize][mapSize];
            for(int i =0; i < mapSize; i++)
            {
                for(int j =0; j<mapSize; j++)
                {

                    mapElementsN[i][j] = scanner.next();
                }
            }
            return mapElementsN;
        }
        public void findPathN(ArrayList<String> tempPath , int length)
        {
            int lastRow = 0;
            int lastColumn = 0;
            if(tempPath.size() != 0)
            {
                String pathToE = tempPath.get(tempPath.size()-1);
                lastRow = Integer.parseInt(pathToE.substring(0,1));
                lastColumn = Integer.parseInt(pathToE.substring(1));
                setMatrix(tempPath,length,lastRow+1,lastColumn);
                setMatrix(tempPath,length,lastRow-1,lastColumn);
                setMatrix(tempPath,length,lastRow,lastColumn+1);
                setMatrix(tempPath,length,lastRow,lastColumn-1);
            }
            else
            {
                setMatrix(tempPath,length,lastRow+1,lastColumn);
                setMatrix(tempPath,length,lastRow,lastColumn+1);
            }
        }

        public void setMatrix(ArrayList<String> tempPath , int length , int lastRow , int lastColumn)
        {
            if((lastRow < mapSize) && (lastRow > -1) && (lastColumn < mapSize) && (lastColumn > -1))
            {
                String arrayElement = mapElements[lastRow][lastColumn];
                if(arrayElement.equalsIgnoreCase("E"))
                {
                    if(lengthOfPath >length+1)
                    {
                        lengthOfPath = length+1;
                    }
                    return;
                }
                else if(arrayElement.equalsIgnoreCase("P"))
                {
                    String path = ""+(lastRow)+lastColumn;
                    if(tempPath.contains(path))
                    {
                        System.out.println("Path added.");
                        return;
                    }
                    else
                    {
                        tempPath.add(path);
                    }
                    length=length+1;
                    findPathN(tempPath,length);
                }
            }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            //lab07.JungleRun_2019_E_166_L7 newObject = new lab07.JungleRun_2019_E_166_L7();
            //newObject.setMapSize();
            lab07.JungleRunN newObject = new lab07.JungleRunN();
            newObject.setMapSize();
            System.out.println(newObject.lengthOfPath);
        }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab06;
public class CityDatabaseN {
    double[][] cityDetails = new double[10][3];
    String[][] cityNameArray = new String[10][2];
    int arraySize = 3;
    double longitude;
    double latitude;
    String cityName;
    int root;
    int leftNode;
    int rightNode;
    int idNumber = 1;
    public void setCityDataDetails(String cityName , double latitude , double longitude)
    {
        if(root == 0)
        {
            cityDetails[1][0] = idNumber;
            cityDetails[1][1] = latitude;
            cityDetails[1][2] = longitude;
            cityNameArray[1][0] = String.valueOf(idNumber);
            cityNameArray[1][1] = cityName;
            idNumber++;
            System.out.println(cityName + " added.");
        }
        else
        {
            this.cityName = cityName;
            this.latitude = latitude;
            this.longitude = longitude;
            cityDetails[1][0] = idNumber;
            cityDetails[1][1] = latitude;
            cityDetails[1][2] = longitude;
            cityNameArray[1][0] = String.valueOf(idNumber);
            cityNameArray[1][1] = cityName;
            idNumber++;
        }

    }

    public void insertion(String cityName , double latitude , double longitude)
    {
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;

        root = 1;
        findArrayIndex(root);
    }

    public boolean alphabeticalOrder(String city01 , String city02)
    {
        return city01.compareTo(city02)>0;
    }
    public void findArrayIndex(int i)
    {
        boolean city02High = alphabeticalOrder(cityNameArray[i][1],cityName);
        if(city02High == true)
        {
            if(cityNameArray[2*root][1] == null)
            {
                cityNameArray[2*root][1] = cityName;
                System.out.println(cityName + " added.");
                return;
            }

            else
            {
                findArrayIndex(i++);
            }
        }
        else
        {
            if(cityNameArray[2*root+1][1] == null)
            {
                cityNameArray[2*root+1][1] = cityName;
                System.out.println(cityName + " added.");
                return;
            }

            else
            {
                findArrayIndex(i++);
            }
        }
    }

    public void printDetails()
    {
        for (int i = 1; i < arraySize; i++)
        {
            for (int j = i + 1; j < arraySize; j++)
            {
                if(cityNameArray[i][1].compareTo(cityNameArray[j][1]) > 0)
                {
                    String temp = cityNameArray[i][1];
                    String temp2 = cityNameArray[i][0];
                    cityNameArray[i][1] = cityNameArray[j][1];
                    cityNameArray[i][0] = cityNameArray[j][0];
                    cityNameArray[j][1] = temp;
                    cityNameArray[j][0] = temp2;
                }
            }

        }
        for(int i =0; i<cityNameArray.length;i++)
        {
            if(cityNameArray[i][1] != null)
                System.out.println(cityNameArray[i][1]);
        }

    }

    public void deleteItem(String cityNameToDelete)
    {
        int i =0;
        for(; i<arraySize; i++)
        {
            if(cityNameArray[i][1] == cityNameToDelete)
            {
                System.out.println(cityNameArray[i][1] + " deleted.");
                cityNameArray[i][0] = null;
                cityNameArray[i][1] = null;
                arraySize--;
            }
        }
    }

    public static void main(String[] args) {
        CityDatabaseN newObject = new CityDatabaseN();
        newObject.setCityDataDetails("Colombo",6.927079,79.861244);
        newObject.insertion("Chicago",41.881832,-87.623177);
        newObject.insertion("Sydney" , -33.865143 ,151.20990);
        newObject.printDetails();
        newObject.deleteItem("Colombo");
        newObject.printDetails();

    }
}

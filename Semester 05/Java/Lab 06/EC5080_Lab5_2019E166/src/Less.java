//https://www.w3schools.com/java/java_files_read.asp
/*******************************************************************
 E/19/166
 ********************************************************************/
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Less extends GenericCommand{

    public void handleCommand(String [] args) {

        if(!args[0].equals("less")) someThingWrong();

        if(args.length != 1) {
            System.out.println("Usage: less");
            return;
        }
        else
        {
            readFile(args[1]);
        }

    }

    public void readFile(String filePath)
    {
        try{
            File object = new File(filePath);
            Scanner readfile = new Scanner(object);
            while(readfile.hasNextLine())
            {
                String lineRead = readfile.nextLine();
                System.out.println(lineRead);
            }
            readfile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File could not find.");
            throw new RuntimeException(e);
        }
    }
}

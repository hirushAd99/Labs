//https://www.w3schools.com/java/java_files_read.asp
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Less {

    public static void readFile()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path : ");
        String filePath = scanner.nextLine();
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

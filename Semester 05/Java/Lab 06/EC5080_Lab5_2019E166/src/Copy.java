//https://www.geeksforgeeks.org/moving-file-one-directory-another-using-java/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*******************************************************************
 E/19/166
 ********************************************************************/

public class Copy extends GenericCommand{
    public void handleCommand(String [] args) throws IOException {

        if (!args[0].equals("quit")) someThingWrong();

        if (args.length != 1) {
            System.out.println("Usage: quit");
            return;
        }
        else {
            copyMethod(args[1],args[2]);
        }
    }
    public void copyMethod(String sourceFilePath , String destinationFilePath) throws IOException {
        Path temp = Files.move(Paths.get(sourceFilePath),Paths.get(destinationFilePath));
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReaderClass {
    public void readFile () throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\TEMP.jfn.000\\Downloads\\Read&Writer\\AccountDetails");
        BufferedReader br = new BufferedReader(fr);
        String st;
        while ((st = br.readLine()) != null)
        {
            System.out.println(st);
        }
        br.close();
        fr.close();
    }
}

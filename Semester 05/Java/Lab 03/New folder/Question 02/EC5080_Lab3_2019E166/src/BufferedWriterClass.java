import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterClass {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("C:\\Users\\TEMP.jfn.000\\Downloads\\Read&Writer\\AccountDetailsATMDetails");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("");
        buffer.close();
        System.out.println("Success");
    }
}

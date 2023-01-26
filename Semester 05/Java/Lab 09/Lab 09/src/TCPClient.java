import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception {
        try{
            Socket socket=new Socket("127.0.0.1",8888);
            //Define & assign the port number and host of the TCP Server
            DataInputStream inStream=new DataInputStream(socket.getInputStream());
            // DataInputStream use to read primitive data types.
            DataOutputStream outStream=new DataOutputStream(socket.getOutputStream());
            // DataOutputStream use to write primitive java data types to an output stream.
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            // Use to read text from a character input stream arrays and lines read by this.
            String clientMessage="",serverMessage="";
            // Define two variables for getting messages.
            // While loop use to get messages from clients and to continue the connection between them.
            while(!clientMessage.equals("bye")){
                clientMessage=br.readLine();
                // Get the client message.
                outStream.writeUTF(clientMessage);
                // Send the client message to server.
                outStream.flush();
                serverMessage=inStream.readUTF();
                // Read the server side message.
                System.out.println("From Server: "+serverMessage);
                // Print the server message on client.
            }
            inStream.close();
            // Close the DataInputStream.
            outStream.close();
            // Close the DataOutputStream.
            socket.close();
            // Close the server.
        }catch(Exception e){
            System.out.println(e);
        }
    }
}



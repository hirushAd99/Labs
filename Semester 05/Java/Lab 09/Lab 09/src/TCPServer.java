import java.net.*;
import java.io.*;
public class TCPServer {
    public static void main(String[] args) throws Exception {
        try{
            ServerSocket server=new ServerSocket(8888);
            //Define & assign the port number of the TCP Server
            Socket serverClient=server.accept();
            // Calling the server.accept method for check the port available or not.
            DataInputStream inStream=new DataInputStream(serverClient.getInputStream());
            // DataInputStream use to read primitive data types.
            DataOutputStream outStream=new DataOutputStream(serverClient.getOutputStream());
            // DataOutputStream use to write primitive java data types to an output stream.
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            // Use to read text from a character input stream arrays and lines read by this.
            String clientMessage="", serverMessage="";
            // Define two variables for getting messages.
            // While loop use to get messages from clients and to continue the connection between them.
            while(!clientMessage.equals("bye")){
                clientMessage=inStream.readUTF();
                // Read the client side message.
                System.out.println("From Client: "+clientMessage);
                // Print the client message on server.
                serverMessage=reader.readLine();
                // Get the server message.
                outStream.writeUTF(serverMessage);
                // Send the server message to client.
                outStream.flush();
            }
            inStream.close();
            // Close the DataInputStream.
            outStream.close();
            // Close the DataOutputStream.
            serverClient.close();
            // Close the socket.
            server.close();
            // Close the server.
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


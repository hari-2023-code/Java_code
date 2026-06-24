import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server waiting...");

        Socket s = ss.accept();

        DataInputStream dis =
                new DataInputStream(s.getInputStream());

        String msg = dis.readUTF();

        System.out.println("Message from client: " + msg);

        ss.close();
    }
}
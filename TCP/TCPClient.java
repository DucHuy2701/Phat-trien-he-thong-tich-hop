package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 8080;
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket(serverIP, serverPort);
        System.out.println("Client connected to TCP Server with Port: "+serverPort);
        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        while(true){
            System.out.print("Number(0-9): ");
            String input = sc.nextLine();
            dos.writeUTF(input);
            dos.flush();
            String output = dis.readUTF();
            System.out.println("From server: "+output);
        }
    }
}

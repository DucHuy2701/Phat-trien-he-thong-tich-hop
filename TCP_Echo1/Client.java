package TCP_Echo1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 8080;
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket(serverIP, serverPort);
        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        while(true){
            System.out.println("Word: ");
            String input = sc.nextLine();
            dos.writeUTF(input);
            dos.flush();
            String output = dis.readUTF();
            System.out.println("From server: "+output);
        }
    }
}

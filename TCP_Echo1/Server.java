package TCP_Echo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public final static int serverPort = 8080;
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running");
        Socket socket = serverSocket.accept();
        String msg_from_client;
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        while(true){
            try {
                msg_from_client = dis.readUTF();
                System.out.println(msg_from_client);
                if(msg_from_client.equals("hello")){
                    dos.writeUTF("hi, nice to meet you"); dos.flush();
                }
                else {
                    dos.writeUTF(msg_from_client); dos.flush();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        //serverSocket.close();
        }
    }
}

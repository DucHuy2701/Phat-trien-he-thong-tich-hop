package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public final static int serverPort = 8080;
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server is running on Port: "+serverPort);
        Socket socket = serverSocket.accept();
        String msg_from_client;
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        while(true){
            try {
                msg_from_client = dis.readUTF();
                if(msg_from_client.equalsIgnoreCase("0")){
                    dos.writeUTF("Zero"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("1")){
                    dos.writeUTF("One"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("2")){
                    dos.writeUTF("Two"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("3")){
                    dos.writeUTF("Three"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("4")){
                    dos.writeUTF("Four"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("5")){
                    dos.writeUTF("Five"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("6")){
                    dos.writeUTF("Six"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("7")){
                    dos.writeUTF("Seven"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("8")){
                    dos.writeUTF("Eight"); dos.flush();
                }
                else if(msg_from_client.equalsIgnoreCase("9")){
                    dos.writeUTF("Nine"); dos.flush();
                }
                else{
                    dos.writeUTF("Not integer"); dos.flush();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        //serverSocket.close();
        }
    }
}

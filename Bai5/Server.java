package Bai5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public DatagramSocket socket;
    public int serverPort = 8080;
    public byte[] msg = new byte[1024];
    public void start() throws IOException{
        socket = new DatagramSocket(serverPort);
        DatagramPacket req = new DatagramPacket(msg, msg.length);
        socket.receive(req);

        String fromClient = "";
        byte[] buffer = fromClient.getBytes();

        InetAddress clientAddress = req.getAddress();
        int clientPort = req.getPort();

        DatagramPacket res = new DatagramPacket(buffer, buffer.length, clientAddress, clientPort);
        socket.send(res);
    }
    public static void main(String[] args) throws IOException{
        Server s = new Server();
        s.start();
    }
}

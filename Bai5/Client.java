package Bai5;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public String hostname;
    public int port;
    public byte[] msg = new byte[1024];
    Scanner sc = new Scanner(System.in);
    public void start(){
        try {
            System.out.print("Server ip: ");
            hostname = sc.nextLine();
            System.out.print("Server port: ");
            port = sc.nextInt();

            InetAddress address = InetAddress.getByName(hostname);
            DatagramSocket socket = new DatagramSocket();

            while(true){
                DatagramPacket req = new DatagramPacket(msg, msg.length, address, port);
                socket.send(req);

                byte[] buffer = new byte[1024];
                DatagramPacket res = new DatagramPacket(buffer, buffer.length);
                socket.receive(res);

                String fromServer = new String(buffer, 0, res.getLength());

                System.out.println(fromServer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Client c = new Client();
        c.start();
    }
}

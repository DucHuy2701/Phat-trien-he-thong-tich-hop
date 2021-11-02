package GK;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args){
        try {
            DatagramSocket s = new DatagramSocket();
            System.out.println("Connected to UDP server!");

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Filename: ");
            String file = br.readLine();
            String request = "READ ..//Phat-trien-he-thong-tich-hop//GK//"+file;
            //byte[] data = file.getBytes();

            DatagramPacket dpsend = new DatagramPacket(request.getBytes(), request.length(), InetAddress.getByName("localhost"), 8080);
            s.send(dpsend);

            byte[] pack = new byte[6000];
            DatagramPacket received = new DatagramPacket(pack, pack.length);
            s.receive(received);

            FileOutputStream fos = new FileOutputStream("D:\\Github_Java\\Phat-trien-he-thong-tich-hop\\GK\\copy_"+file);
            fos.write(pack, 0, pack.length);
            System.out.println("Read file success!");
            System.out.println(new String(received.getData(), 0, received.getLength()));
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

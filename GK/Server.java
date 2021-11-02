package GK;

import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args){
        try {
            DatagramSocket s = new DatagramSocket(8080);
            System.out.println("UDP server is online!");

            byte[] b1 = new byte[6000];

            System.out.println("From client: ");
            DatagramPacket received = new DatagramPacket(b1, b1.length);
            s.receive(received);

            String str = new String(received.getData(), 0, received.getLength());
            System.out.println("Server read file: " + str);
            String file = str.substring(("READ ").length(), str.length());
            System.out.println("Read file: "+file);
            File readfile = new File(file);

            if(readfile.exists()){
                FileInputStream fis = new FileInputStream(file);
                int n = fis.available();
                byte[] b2 = new byte[n];
                fis.read(b2, 0, n);

                DatagramPacket dpsend = new DatagramPacket(b2, b2.length, received.getAddress(),received.getPort());
                s.send(dpsend);

                System.out.println(new String(dpsend.getData(), 0, dpsend.getLength()));
                System.out.println("File read success!");
                fis.close();
            }
            else{
                String err = "File " + str + " not found!";
                DatagramPacket senderr = new DatagramPacket(err.getBytes(),err.length(),received.getAddress(),received.getPort());
                s.receive(senderr);
            }
            s.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

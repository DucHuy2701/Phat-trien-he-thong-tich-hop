package Bai6;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 8080;

    public void start(){
        try {
            Socket socket = new Socket(serverIP, serverPort);
            Scanner sc = new Scanner(System.in);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            int n = -1;

            while(n!=0){
                System.out.println("1. sum 1");
                System.out.println("2. sum 2");
                System.out.println("3. sum 3");
                System.out.println("0. exit1");
                System.out.print("Choose: ");
                n = sc.nextInt();
                out.write(n);
                out.flush();
                System.out.print("Number: ");
                int x = sc.nextInt();
                out.write(x);
                out.flush();
                int output = in.read();
                System.out.println("result = "+output);
            }
            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws UnknownHostException, IOException{
        Client c = new Client();
        c.start();
    }
}

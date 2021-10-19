package Bai6;

import java.io.BufferedReader;
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
                System.out.println("1. Tong 1+3+5+7+...+(2n+1)");
                System.out.println("2. Tong 1*2 + 2*3+...+n*(n+1)");
                System.out.println("3. Bieu thuc 1-2+3-4+..+(2n+1)");
                System.out.print("Choose(1/2/3): ");

                n = sc.nextInt();
                out.write(n);
                out.flush();

                System.out.print("Number: ");
                int x = sc.nextInt();
                out.write(x);
                out.flush();

                int output = in.read();
                System.out.println("result = " + output);
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

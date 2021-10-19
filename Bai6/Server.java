package Bai6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static int port = 8080;
    public void start(){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running!");
            Socket socket = serverSocket.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            int msg = -1;

            while(msg!=0){
                msg = in.read();
                int n = 0;
                switch(msg){
                    case 1:{
                        n = in.read();
                        out.write(sum1(n));
                        out.flush();
                        break;
                    }
                    case 2:{
                        n = in.read();
                        out.write(sum2(n));
                        out.flush();
                        break;
                    }
                    case 3:{
                        n = in.read();
                        out.write(sum3(n));
                        out.flush();
                        break;
                    }
                }
            }
            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int sum1(int n){
        if(n<1)
            return 0;
        int sum=0;
        for(int i = 1; i<=n; i=i+2){
            sum += i;
        }
        return sum;
    }
    public static int sum2(int n){
        if(n<2)
            return 0;
        else{
            return n*(n-1) + sum2((n-1)*(n-2));
        }
    }
    public static int sum3(int n){
        if(n==1)
            return 1;
        if(n%2==0)
            return -n + sum3(n-1);
        else
            return n + sum3(n-1);
    }
    public static void main(String[] args) throws IOException{
        Server s = new Server();
        s.start();
    }
}

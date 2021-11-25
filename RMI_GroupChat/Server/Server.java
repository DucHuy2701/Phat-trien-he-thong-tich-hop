package RMI_GroupChat.Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Server {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine().trim();

            LocateRegistry.createRegistry(1099);
            Registry reg = LocateRegistry.getRegistry();
            System.out.println("Registration successfully!");

            ServerImpl chatServer = new ServerImpl(name);
            String url = "localhost/Chat";
            reg.bind(url, chatServer);
            System.out.println("[System]: server is ready! at "+url);

            String onl = "[" + chatServer.getName() + "] is online!";
            chatServer.broadcastMsg(onl);
            
            while(true){
                String msg = sc.nextLine().trim();
                msg = "[" + chatServer.getName() + "] " + msg;
                chatServer.broadcastMsg(msg);
            }
        } catch (Exception e) {
            System.out.println("[System]: Server down!" + e);
        }
    }
}

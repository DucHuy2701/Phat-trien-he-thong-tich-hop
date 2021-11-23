package RMI_GroupChat.Client;

import java.rmi.Naming;
import java.util.Scanner;

import RMI_GroupChat.Server.IServer;

public class Client {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine().trim();

            IServer chatServer = (IServer) Naming.lookup("localhost/Chat");
            ClientImpl chatClient = new ClientImpl(name, chatServer);

            while(true){
                String msg = sc.nextLine().trim();
                msg = "[" + chatClient.getName() + "]" + msg;
                chatServer.broadcastMsg(msg);
            }
        } catch (Exception e) {
            System.out.println("[System]: Server down!");
        }
    }
}

package RMI_Thread;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args){
        try {
            System.out.println("Initializing Server...");
            
            SortImpl obj = new SortImpl();
            System.out.println("Create object successful!");

            LocateRegistry.createRegistry(8080);
            Registry reg = LocateRegistry.getRegistry();

            reg.bind("localhost/Sort", obj);
            System.out.println("Registration successfully - Server is running!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

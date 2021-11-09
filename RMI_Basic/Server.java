package RMI_Basic;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{
    public static void main(String[] args){
        try {
            StringImplement obj = new StringImplement();
            System.out.println("Create object successful!");

            LocateRegistry.createRegistry(8080);
            Registry reg = LocateRegistry.getRegistry(8080);
            reg.bind("localhost", obj);
            System.out.println("Registration successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

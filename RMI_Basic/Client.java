package RMI_Basic;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static String input;
    public static int loop = 1;
    public static void main(String[] args) throws NotBoundException{
        Registry reg;
        Scanner sc = new Scanner(System.in);
        try {
            while(loop!=0){
                reg = LocateRegistry.getRegistry(8080);
                StringInterface sint = (StringInterface) reg.lookup("localhost");

                System.out.print("Input(type exit to disconnect): ");
                input = sc.nextLine();

                if(input.equalsIgnoreCase("exit")){
                    System.out.println("Disconnect to RMI server!");
                    loop=0;
                }
                else{
                    System.out.println("Revert & Uppercase: "+sint.revertUppercase(input));
                    System.out.println("Count word: "+sint.countWord(input));
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

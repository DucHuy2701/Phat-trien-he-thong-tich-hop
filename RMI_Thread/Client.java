package RMI_Thread;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args){
        try {
            int[] uns1 = {93, 81, 95, 74}, uns2 = {93, 81, 95, 74};
            int[] sorted1, sorted2;

            Registry reg = LocateRegistry.getRegistry(8080);

            SortInterface s1 = (SortInterface) reg.lookup("localhost/sort1");
            SortInterface s2 = (SortInterface) reg.lookup("localhost/sort2");
            sorted1 = s1.sort(uns1);
            sorted2 = s2.sort(uns2);
            
            System.out.println("Sorted!");
            for(int i=0; i<uns1.length; i++)
                System.out.println(sorted1+" and "+sorted2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

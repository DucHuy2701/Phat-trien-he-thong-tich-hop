package RMI_Basic;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringImplement extends UnicastRemoteObject implements StringInterface{

    protected StringImplement() throws RemoteException {
        super();
    }

    @Override
    public String revertUppercase(String s) throws RemoteException {
        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString().toUpperCase();
        return result;
    }

    @Override
    public int countWord(String s) throws RemoteException {
        System.out.println("String from client: "+s);
        String[] sp = s.split("\\s+");
        int count=0;
        for(String i : sp){
            count++;
            System.out.println(i);
        } 
        return count;
    }
    
    
}

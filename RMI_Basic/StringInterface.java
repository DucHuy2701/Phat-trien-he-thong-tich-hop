package RMI_Basic;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringInterface extends Remote{
    public String revertUppercase(String s) throws RemoteException;
    public int countWord(String s) throws RemoteException;
}

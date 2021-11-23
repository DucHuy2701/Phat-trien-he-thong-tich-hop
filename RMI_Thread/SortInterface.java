package RMI_Thread;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SortInterface extends Remote{
    public int[] sort(int data[]) throws RemoteException;
}

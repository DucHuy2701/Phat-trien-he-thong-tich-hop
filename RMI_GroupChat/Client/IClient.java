package RMI_GroupChat.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClient extends Remote{
    public String getName() throws RemoteException;
    public void retriveMsg(String msg) throws RemoteException;
}

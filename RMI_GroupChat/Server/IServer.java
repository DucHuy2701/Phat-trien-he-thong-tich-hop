package RMI_GroupChat.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import RMI_GroupChat.Client.IClient;

public interface IServer extends Remote{
    public String getName() throws RemoteException;
    public void broadcastMsg(String msg) throws RemoteException;
    public void registerClient(IClient client) throws RemoteException;
    public List<IClient> getClients() throws RemoteException;
}

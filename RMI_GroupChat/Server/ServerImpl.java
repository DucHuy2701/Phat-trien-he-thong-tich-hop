package RMI_GroupChat.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import RMI_GroupChat.Client.IClient;

public class ServerImpl extends UnicastRemoteObject implements IServer{
    public String name;
    public List<IClient> clients;


    public ServerImpl(String name) throws RemoteException {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    @Override
    public String getName() throws RemoteException {
        return this.name;
    }

    @Override
    public void broadcastMsg(String msg) throws RemoteException {
        for(IClient client : clients)
            client.retriveMsg(msg);
        System.out.println(msg);
    }

    @Override
    public void registerClient(IClient client) throws RemoteException {
        this.clients.add(client);
    }

    @Override
    public List<IClient> getClients() throws RemoteException {
        return this.clients;
    }
    
}

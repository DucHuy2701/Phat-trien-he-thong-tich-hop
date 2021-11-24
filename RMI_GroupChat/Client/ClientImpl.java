package RMI_GroupChat.Client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import RMI_GroupChat.Server.IServer;

public class ClientImpl extends UnicastRemoteObject implements IClient{
    private String name;
    private IServer chatServer;

    public ClientImpl(String name, IServer chatServer) throws RemoteException {
        this.name = name;
        this.chatServer = chatServer;
        chatServer.registerClient(this);

        String msg = ">> " + this.name + " is connected!";
        chatServer.broadcastMsg(msg);
    }

    @Override
    public String getName() throws RemoteException {
        return this.name;
    }

    @Override
    public void retrieveMsg(String msg) throws RemoteException {
        System.out.println(msg);
    }
    
}

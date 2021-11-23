package RMI_Thread;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SortImpl extends UnicastRemoteObject implements SortInterface{

    protected SortImpl() throws RemoteException {
        super();
    }

    @Override
    public int[] sort(int[] data) throws RemoteException {
        int n = data.length;
        int tmp=0;
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-i-1; j++){
                if(data[j] < data[j+1])
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
            }
        }
        return data;
    }
    
}

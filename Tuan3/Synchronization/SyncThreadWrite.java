package Tuan3.Synchronization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SyncThreadWrite extends Thread{
    FileOutputStream fos;
    DataOutputStream dos;
    SyncFiles sf;

    public SyncThreadWrite(){
        
    }
    public SyncThreadWrite(FileOutputStream pfos, SyncFiles psf){
        this.fos = pfos;
        this.dos = new DataOutputStream(pfos);
        this.sf = psf;
    }

    public void run(){
        try {
            sf.fileWriter(this.fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

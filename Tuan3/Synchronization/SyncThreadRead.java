package Tuan3.Synchronization;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class SyncThreadRead extends Thread{
    FileInputStream fis;
    DataInputStream dis;
    SyncFiles sf;

    public SyncThreadRead(){

    }
    public SyncThreadRead(FileInputStream pfis, SyncFiles psf){
        this.fis = pfis;
        this.dis = new DataInputStream(pfis);
        this.sf = psf;
    }

    public void run(){
        try {
            sf.fileReader(this.fis);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

package Tuan3.FileReader;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTReader extends Thread{
    FileInputStream fis;
    DataInputStream dis;

    public FileTReader(){
        
    }

    public FileTReader(FileInputStream pfis){
        this.fis = pfis;
        this.dis = new DataInputStream(fis);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" running...");
        
        try {
            String s = new String(this.dis.readAllBytes());
            System.out.println(s);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            this.fis.close();
            this.dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done "+Thread.currentThread().getName());
    }
}

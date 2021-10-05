package Tuan3.FileWrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTWrite extends Thread{
    FileOutputStream fos;

    public FileTWrite(){
        
    }

    public FileTWrite(FileOutputStream pfos){
        this.fos = pfos;
    }

    public void run(){
        double rand = Math.random();
        System.out.println(Thread.currentThread().getName()+" running...");
        for(int i=0; i<10; i++){
            try {
                this.dos.writeInt((int) Math.random());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done "+Thread.currentThread().getName());
    }
}

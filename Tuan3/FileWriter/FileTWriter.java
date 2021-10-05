package Tuan3.FileWriter;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileTWriter extends Thread{
    FileOutputStream fos;
    DataOutputStream dos;

    public FileTWriter(){
        
    }

    public FileTWriter(FileOutputStream pfos){
        this.fos = pfos;
        this.dos = new DataOutputStream(fos);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running...");
        for(int i=0; i<10; i++){
            try {
                Random rand = new Random();
                int randNum = rand.nextInt(100-1) + 1;
                String s = String.valueOf(randNum);
                System.out.print(Thread.currentThread().getName()+": ");
                System.out.println(randNum);
                this.dos.writeBytes(s+", ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.fos.close();
            this.dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done "+Thread.currentThread().getName());
    }
}

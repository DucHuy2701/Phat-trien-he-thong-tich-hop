package Tuan3.Synchronization.txt;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class SyncFiles {
    synchronized public void fileReader(){
        FileInputStream fis = null;
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(Thread.currentThread().getName()+" is running...");
        try {
            String s = new String(dis.readAllBytes());
            System.out.println(s);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fis.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done "+Thread.currentThread().getName());
    }

    synchronized public void fileWriter() throws IOException{
        FileOutputStream fos = null;
        DataOutputStream dos = new DataOutputStream(fos);

        for(int i=0; i<10; i++){
            try {
                Random rand = new Random();
                int randNum = rand.nextInt(100-1) + 1;
                String s = String.valueOf(randNum);
                System.out.print(Thread.currentThread().getName()+": ");
                System.out.println(randNum);
                dos.writeBytes(s+", ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fos.close();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done "+Thread.currentThread().getName());
    }
}

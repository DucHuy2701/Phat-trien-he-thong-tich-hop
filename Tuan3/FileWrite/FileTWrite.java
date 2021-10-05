package Tuan3.FileWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileTWrite extends Thread{
    FileOutputStream fos;

    public FileTWrite(){
        
    }

    public FileTWrite(FileOutputStream pfos){
        this.fos = pfos;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        Random randInt = new Random();
        System.out.println(Thread.currentThread().getName()+" => N: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++){
            try {
                String out = randInt.toString();
                byte b[] = out.getBytes();
                this.fos.write(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done.."+Thread.currentThread().getName());
    }
}

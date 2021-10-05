package Tuan3.Synchronization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SyncApp {
    public static void main(String[] args) throws FileNotFoundException{
        SyncFiles sf = new SyncFiles();
        FileInputStream fis = new FileInputStream("Tuan3\\Synchronization/txt/data.txt");
        FileOutputStream fos = new FileOutputStream("Tuan3\\Synchronization/txt/data.txt");

        SyncThreadWrite sw = new SyncThreadWrite(fos, sf);
        SyncThreadRead sr = new SyncThreadRead(fis, sf);

        sw.start();
        sr.start();
    }
}

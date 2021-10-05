package Tuan3.FileWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTWriteApp {
    public static void main(String[] args) throws FileNotFoundException{

        FileOutputStream fos1 = new FileOutputStream("Tuan3\\FileWrite/txt/twrite1.txt");
        FileOutputStream fos2 = new FileOutputStream("Tuan3\\FileWrite/txt/twrite2.txt");
        FileOutputStream fos3 = new FileOutputStream("Tuan3\\FileWrite/txt/twrite3.txt");

        FileTWrite t1 = new FileTWrite(fos1);
        FileTWrite t2 = new FileTWrite(fos2);
        FileTWrite t3 = new FileTWrite(fos3);

        t1.start();
        t2.start();
        t3.start();
    }
}

package Tuan3.FileWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTWriterApp {
    public static void main(String[] args) throws FileNotFoundException{

        FileOutputStream fos1 = new FileOutputStream("Tuan3\\FileWriter/txt/twrite1.txt");
        FileOutputStream fos2 = new FileOutputStream("Tuan3\\FileWriter/txt/twrite2.txt");
        FileOutputStream fos3 = new FileOutputStream("Tuan3\\FileWriter/txt/twrite3.txt");

        FileTWriter t1 = new FileTWriter(fos1);
        FileTWriter t2 = new FileTWriter(fos2);
        FileTWriter t3 = new FileTWriter(fos3);

        t1.start();
        t2.start();
        t3.start();
    }
}

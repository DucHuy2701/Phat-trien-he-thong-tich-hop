package Tuan3.FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTReaderApp {
    public static void main(String[] args) throws FileNotFoundException{

        FileInputStream fis1 = new FileInputStream("Tuan3\\FileWriter/txt/twrite1.txt");
        FileInputStream fis2 = new FileInputStream("Tuan3\\FileWriter/txt/twrite2.txt");
        FileInputStream fis3 = new FileInputStream("Tuan3\\FileWriter/txt/twrite3.txt");

        FileTReader t1 = new FileTReader(fis1);
        FileTReader t2 = new FileTReader(fis2);
        FileTReader t3 = new FileTReader(fis3);

        t1.start();
        t2.start();
        t3.start();
    }
}

package Tuan3.FileWrite;

import java.io.FileOutputStream;

public class FileTWriteApp {
    public static void main(String[] args){
        FileOutputStream fos1 = null;
        //FileOutputStream fos2 = null;
        //FileOutputStream fos3 = null;
        try {
            fos1 = new FileOutputStream("./txt/twrite1.txt");
            //fos2 = new FileOutputStream("/txt/twrite2.txt");
            //fos3 = new FileOutputStream("/txt/twrite3.txt");
        } catch (Exception e) {
            System.out.println(e);
        }

        FileTWrite t1 = new FileTWrite(fos1);
        //FileTWrite t2 = new FileTWrite(fos2);
        //FileTWrite t3 = new FileTWrite(fos3);

        t1.start();
        //t2.start();
        //t3.start();}
    }
}

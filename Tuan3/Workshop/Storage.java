package Tuan3.Workshop;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Storage implements WSInterface{
    public int capacity;
    public List<String> inventory = new ArrayList<String>();
    FileOutputStream fos;
    FileInputStream fis;
    DataOutputStream dos;
    DataInputStream dis;

    public Storage(){};
    public Storage(int capa){
        this.capacity = capa;
    }

    @Override
    public void viewInventory(){
        try {
            fis = new FileInputStream("Tuan3\\Workshop/storage.txt");
            dis = new DataInputStream(fis);

            System.out.println("===View storage===");
            dis.readByte();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void importProduct() {
        
    }

    @Override
    public void exportProduct() {
        
    }

    @Override
    public void storageNotify() {
        
    }
    
}

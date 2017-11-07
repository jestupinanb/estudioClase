
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaime
 */
public class DataInput2 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String file = "DataOutput2";//args[0];
        DataInputStream din = new DataInputStream(new FileInputStream(file));
        double data;
        double sumador=0;
        try{
            while(true){
                data = din.readDouble();
                sumador += data;
                System.out.println(data);
            }
        }
        catch(EOFException eofe){
            din.close();
        }
        System.out.println("Suma= "+sumador);
    }
}

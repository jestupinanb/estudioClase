
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaime
 */
public class Serialization {
    public static void main(String[] args) throws Exception{
        String flag = "-r";//args[0];//instruccion
        String file = "persona";//args[1];//Nombre del archivo
        Person c = new Person("F","G");
        Person d;
        if(flag.equals("-w")){
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(file)));
            out.writeObject(c);
            
        }
        else if(flag.equals("-r")){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(file)));
            System.out.println("Reading serialized object");
            d = (Person) in.readObject();
            System.out.println(d.getFirstName()+","+d.getLastName());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileWriter;
/**
 *
 * @author Jaime
 */
public class Writer1 {
    public static void main(String[] args) throws Exception{
        String file = "Hola";//args[0];
        String output = "Hellow World";
        FileWriter fw = new FileWriter(file);
        fw.write(output);
        fw.close();
    }
}

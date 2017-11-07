
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class DataOutput2 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String file = "DataOutput2";//args[0];
        double [] data = {1.1,1.2,1.3,1.4,1.5,1.5};
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(file));
        for (int i = 0; i < data.length; i++) {
            dout.writeDouble(data[i]);
        }
        dout.close();
    }
}

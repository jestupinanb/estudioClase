/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Jaime
 */
public class CopyCharacters {
    public static void main(String args[]) throws IOException{
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("Characteroutput.txt");
            int c;
            int contador=0;
            while((c = inputStream.read()) != -1){
                outputStream.write(c);
                System.out.println("Entre "+(++contador));
            }
        } finally {
            if(inputStream != null)
                inputStream.close();
            if(outputStream != null)
                outputStream.close();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialPrueba;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Jaime
 */
public class Documental extends Video {
    static int contador=0;
    String genero;

    public Documental() {
    }
    
    public Documental(String genero, String titulo, String nombreDirector, int annioCreacion) {
        super(titulo, nombreDirector, annioCreacion);
        this.genero = genero;
    }
    
    public void guardarClase() throws Exception {
        FileWriter file = new FileWriter("Documental "+contador+".txt");
        file.write(titulo+" ");
        file.write(nombreDirector+" ");
        file.write(annioCreacion+" ");
        file.write(genero+" ");
        file.close();
    }
    
    @Override
    protected String retornarInformacion() {
        String retornar = "";
        retornar += "Titulo: "+super.titulo+" Nombre del director: "+super.nombreDirector+" Año de creacion: "+super.annioCreacion+"\n";
        retornar += "Genero "+genero;
        return retornar;
    }

    @Override
    public void cargarInformacion(String nombre) throws Exception {
        Scanner leer = new Scanner(new File(nombre));
        this.titulo = leer.next();
        this.nombreDirector = leer.next();
        this.annioCreacion = leer.nextInt();
        this.genero = leer.next();
    }
}

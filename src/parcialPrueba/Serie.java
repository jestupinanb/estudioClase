/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialPrueba;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import static parcialPrueba.Documental.contador;

/**
 *
 * @author Jaime
 */
public class Serie extends Video {
    int capitulo;
    int temporada;

    public Serie(int capitulo, int temporada, String titulo, String nombreDirector, int annioCreacion) {
        super(titulo, nombreDirector, annioCreacion);
        this.capitulo = capitulo;
        this.temporada = temporada;
    }

    public Serie() {
    }
    
    public void guardarClase() throws Exception {
        FileWriter file = new FileWriter("Serie "+contador+".txt");
        file.write(titulo+" ");
        file.write(nombreDirector+" ");
        file.write(annioCreacion+" ");
        file.write(capitulo+" ");
        file.write(temporada+" ");
        file.close();
    }
    
    @Override
    protected String retornarInformacion() {
        String retornar = "";
        retornar += "Titulo: "+super.titulo+" Nombre del director: "+super.nombreDirector+" Año de creacion: "+super.annioCreacion+"\n";
        retornar += "Capitulo "+capitulo+" temporada "+temporada;
        return retornar;
    }

    @Override
    public void cargarInformacion(String nombre) throws Exception {
        Scanner leer = new Scanner(new File(nombre));
        this.titulo =  leer.next();
        this.nombreDirector = leer.next();
        this.annioCreacion = leer.nextInt();
        this.capitulo = leer.nextInt();
        this.temporada = leer.nextInt();
    }
    
}

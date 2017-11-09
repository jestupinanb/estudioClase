/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialPrueba;

import java.io.FileWriter;
import static parcialPrueba.Documental.contador;

/**
 *
 * @author Jaime
 */
public abstract class Video {
    String titulo;
    String nombreDirector;
    int annioCreacion;

    public Video() {
    }

    public Video(String titulo, String nombreDirector, int annioCreacion) {
        this.titulo = titulo;
        this.nombreDirector = nombreDirector;
        this.annioCreacion = annioCreacion;
    }
    
    public abstract void cargarInformacion(String nombre) throws Exception;
    
    public abstract void guardarClase() throws Exception;
    
    protected abstract String retornarInformacion();
}
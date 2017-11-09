/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialPrueba;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import static parcialPrueba.Documental.contador;

/**
 *
 * @author Jaime
 */
public class Pelicula extends Video{
    ArrayList<Actor> actores = new ArrayList();

    public Pelicula() {}
    
    public Pelicula(String titulo, String nombreDirector, int annioCreacion) {
        super(titulo, nombreDirector, annioCreacion);
    }
    
    public void addActor(String nombre, String Apellido){
        actores.add(new Actor(nombre,Apellido));
    }
    
    @Override
    public void guardarClase() throws Exception {
        FileWriter file = new FileWriter("Pelicula "+contador+".txt");
        file.write(titulo+" ");
        file.write(nombreDirector+" ");
        file.write(annioCreacion+" ");
        for(Actor actor:actores){
            file.write("\n"+actor.getNombre()+" "+actor.getApellidos());
        }
        file.close();
    }
    
    @Override
    protected String retornarInformacion() {
        String retornar = "";
        retornar += "Titulo: "+super.titulo+" Nombre del director: "+super.nombreDirector+" Año de creacion: "+super.annioCreacion;
        for(Actor actor: actores){
            retornar += "\n"+actor.getNombre()+" "+actor.getApellidos();
        }
        return retornar;
    }   

    @Override
    public void cargarInformacion(String nombre) throws Exception{
        Scanner leer = new Scanner(new File(nombre));
        this.titulo = leer.next();
        this.nombreDirector = leer.next();
        this.annioCreacion = leer.nextInt();
        while(leer.hasNext()){
            actores.add(new Actor(leer.next(),leer.next()));
        }
    }
}
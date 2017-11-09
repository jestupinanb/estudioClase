/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialPrueba;
import java.util.*;
/**
 *
 * @author Jaime
 */
public class main {
    public static void main(String[] args) throws Exception{
//        Documental documental = new Documental("genero","titulo","nombreDirector",1995);
//        documental.guardarClase();
//        Pelicula pelicula = new Pelicula("titulo","nombreDirector",1994);
//        Serie serie = new Serie(1,3,"titulo","nombreDirector",1996);
//        serie.guardarClase();
//        pelicula.addActor("Un", "actor");
        ArrayList<Video> videos = new ArrayList();
        ArrayList<Pelicula> peliculas = new ArrayList();
        ArrayList<Serie> series = new ArrayList();
        ArrayList<Documental> documentales = new ArrayList();
        
        peliculas.add(new Pelicula());
        documentales.add(new Documental());
        series.add(new Serie());
        
        documentales.get(0).cargarInformacion("Documental 0.txt");
        peliculas.get(0).cargarInformacion("Pelicula 0.txt");
        series.get(0).cargarInformacion("Serie 0.txt");
        
        videos.addAll(peliculas);
        videos.addAll(series);
        videos.addAll(documentales);
        
        System.out.println("Videos Size"+videos.size());
        listarInformacion(videos);
        
        System.out.println("Pelicula \n"+peliculas.get(0).retornarInformacion());
        System.out.println("Serie \n"+series.get(0).retornarInformacion());
        System.out.println("Documental \n"+documentales.get(0).retornarInformacion());
        
        Pelicula x = new Pelicula();
        Actor a = new Actor();
        
        
        
    }
    
    public static void listarInformacion(ArrayList<Video> videos){
        for(Video video : videos){
        System.out.println("\n"+video.retornarInformacion());
        }
    }
}
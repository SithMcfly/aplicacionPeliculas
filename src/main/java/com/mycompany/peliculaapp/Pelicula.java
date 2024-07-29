
package com.mycompany.peliculaapp;



/**
 *
 * @author Sith_Mcfly
 */

public class Pelicula {

    
    private int id;
    
    private String titulo;
    private String espectador;
    private String lugar;
    private String fecha;
    
    public Pelicula(String titulo) {
        this.titulo = titulo;
                
    }
    public Pelicula(int id, String titulo, String lugar, String espectador, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.lugar = lugar;
        this.espectador = espectador;
        this.fecha = fecha;  
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEspectador() {
        return espectador;
    }

    public void setEspectador(String espectador) {
        this.espectador = espectador;
    }
    
       public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String toString(){
        return String.format("La pelicula %s la vio %s en %s el día %s", 
                this.titulo,
                this.espectador,
                this.lugar,
                this.fecha);
       
    }
}

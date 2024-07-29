/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculaapp;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sith_Mcfly
 */
public class Main {
    public static void main(String[] args) throws SQLException {
      
        ControladoraPersistencia crud = new ControladoraPersistencia();
        List <Pelicula> peliculas = crud.listarPeliculas();
        
        for(Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
               
    }
    
}

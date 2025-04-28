/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

import java.util.List;

/**
 *
 * @author estudiantes
 */
public class Periodista implements IObserver {
    
    private String nombre;

    public Periodista(String nombre) {
        this.nombre = nombre;
        
        
        
    }

    @Override
    public void update(List<String> cursos) {
        
        
        
        System.out.println(nombre + " (Periodista) - Los nuevos cursos para el programa son: " + cursos);
    }
}

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
public class Webmaster implements IObserver {
    
    private String nombre;

    public Webmaster(String nombre) {
        
        this.nombre = nombre;
        
        
    }

    @Override
    public void update(List<String> cursos) {
        
        
        System.out.println(nombre + " (Webmaster) - La lista de cursos se ha actualizado: " + cursos);
    }
}
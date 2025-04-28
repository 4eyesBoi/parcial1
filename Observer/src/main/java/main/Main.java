/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import observers.CommunityManager;
import observers.IObserver;
import observers.Periodista;
import observers.Webmaster;
import subjects.CursoManager;

/**
 *
 * @author estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoManager cursoManager = new CursoManager();

       
        IObserver webmaster = new Webmaster("Andrea Mahecha");
        IObserver periodista = new Periodista("Luz Dary Varela");
        IObserver communityManager = new CommunityManager("Laura Molina");

        
        cursoManager.registrarObserver(webmaster);
        cursoManager.registrarObserver(periodista);
        cursoManager.registrarObserver(communityManager);

        
        cursoManager.agregarCurso("Inteligencia Artificial aplicada a la educación");
        cursoManager.agregarCurso("Pedagogía Decolonial");
        cursoManager.agregarCurso("Ciudades Inteligentes");

        
        cursoManager.eliminarCurso("Ciudades Inteligentes");
    }
}
    
    


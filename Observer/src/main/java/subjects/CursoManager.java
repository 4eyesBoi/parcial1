/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subjects;

/**
 *
 * @author estudiantes
 */
import java.util.ArrayList;
import java.util.List;
import observers.IObserver;


public class CursoManager {
    
    
    private List<IObserver> observers = new ArrayList<>();
    
    private List<String> cursos = new ArrayList<>();
    

 
    public void registrarObserver(IObserver observer) {
        
        
        observers.add(observer);
    }

  
    public void eliminarObserver(IObserver observer) {
        
        observers.remove(observer);
    }

   
    public void notificarObservadores() {
        
        
        for (IObserver observer : observers) {
            
            observer.update(cursos);
            
        }
        
        
    }

    
    public void agregarCurso(String curso) {
        
        cursos.add(curso);
        notificarObservadores();
        
        
    }

    
    public void eliminarCurso(String curso) {
        
        
        cursos.remove(curso);
        notificarObservadores();
        
        
    }

    
    public List<String> getCursos() {
        return cursos;
    }
}

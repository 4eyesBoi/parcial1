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
public class CommunityManager implements IObserver {
    private String nombre;

    public CommunityManager(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(List<String> cursos) {
        System.out.println(nombre + " (Community Manager) - Los cursos se han actualizado en redes sociales: " + cursos);
    }
}
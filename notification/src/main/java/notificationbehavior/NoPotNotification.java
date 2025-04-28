/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificationbehavior;

/**
 *
 * @author estudiantes
 */
public class NoPotNotification implements IPotNotificationBehavior{

  

    @Override
    public void notifyPot() {
        System.out.println("El usuario no sera notificado cuando su monto sea bajo");
    }
    
}

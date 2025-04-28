/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificationbehavior;

/**
 *
 * @author estudiantes
 */
public class LowPotNotification implements IPotNotificationBehavior{

   

    @Override
    public void notifyPot() {
        System.out.println("El usuario va a ser notificado cuando su monto sea bajo");
    }
    
}

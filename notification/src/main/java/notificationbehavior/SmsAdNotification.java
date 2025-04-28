/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificationbehavior;

/**
 *
 * @author estudiantes
 */
public class SmsAdNotification implements IAdNotificationBehavior{

    @Override
    public void notifyAd() {
        System.out.println("El usuario esta siendo notificado via SMS");
    }
    
}

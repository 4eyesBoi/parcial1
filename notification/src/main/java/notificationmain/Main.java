/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notificationmain;

import notificationbehavior.EmailAdNotification;
import notificationbehavior.InstantTransferNotification;
import notificationbehavior.LowPotNotification;
import notificationbehavior.NoPotNotification;
import notificationbehavior.SmsAdNotification;
import notificationbehavior.SumaryTransferNotification;
import notificationtype.AdNotification;

/**
 *
 * @author estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmsAdNotification smsAN = new SmsAdNotification();
        EmailAdNotification eAN = new EmailAdNotification();
        
        SumaryTransferNotification stN = new SumaryTransferNotification();
        InstantTransferNotification itN = new InstantTransferNotification();
        
        LowPotNotification lpN = new LowPotNotification();
        NoPotNotification npN = new NoPotNotification();
        
        
        AdNotification an = new AdNotification(eAN, itN, npN);
        
        
        
        an.performAdNotification();
        an.performPotNotification();
        an.performTransferNotification();
    }
    
}

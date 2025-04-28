/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificationtype;

import notificationbehavior.IAdNotificationBehavior;
import notificationbehavior.IPotNotificationBehavior;
import notificationbehavior.ITransferNotificationBehavior;

/**
 *
 * @author estudiantes
 */
public class NotificationType {
    IAdNotificationBehavior adNotificationBehavior;
    ITransferNotificationBehavior transferNotificationBehavior;
    IPotNotificationBehavior potNotificationBehavior;
    
    public NotificationType(IAdNotificationBehavior adNotificationBehaviorParam, ITransferNotificationBehavior transferNotificationBehaviorParam, IPotNotificationBehavior potNotificationBehaviorParam){
    
        this.adNotificationBehavior = adNotificationBehaviorParam;
        this.transferNotificationBehavior = transferNotificationBehaviorParam;
        this.potNotificationBehavior = potNotificationBehaviorParam;
    }
    
    public void performAdNotification(){
        adNotificationBehavior.notifyAd();
    
    }
    
    public void performPotNotification(){
        potNotificationBehavior.notifyPot();
    
    }
    
    public void performTransferNotification(){
        transferNotificationBehavior.notifyTransfer();
    
    }
}

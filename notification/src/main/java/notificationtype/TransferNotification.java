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
public class TransferNotification extends NotificationType{
    
    public TransferNotification(IAdNotificationBehavior adNotificationBehaviorParam, ITransferNotificationBehavior transferNotificationBehaviorParam, IPotNotificationBehavior potNotificationBehaviorParam) {
        super(adNotificationBehaviorParam, transferNotificationBehaviorParam, potNotificationBehaviorParam);
    }
    
}

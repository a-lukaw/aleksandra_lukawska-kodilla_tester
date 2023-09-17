//7.6. Mockito - ćwiczenia
package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {

        notificationService.sendNotification(notification);
        Mockito.verify(firstClient, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {

        notificationService.addSubscriber(firstClient);

        notificationService.sendNotification(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    }


    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {

        //dodajemy subskrypcje
        addSubscribers(firstClient, secondClient, thirdClient);

        //wysyłamy powiadomienie
        notificationService.sendNotification(notification);

        //oczekujemy, że każdy z klientów dostał jedno powiadomienie
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {

        addSubscribers(firstClient, secondClient, thirdClient);

        notificationService.sendNotification(notification);

        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        addSubscribers(firstClient, secondClient);

        notificationService.removeSubscriber(secondClient);

        notificationService.sendNotification(notification);

        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }

    private void addSubscribers(Client... clients) {
        for (Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }
}

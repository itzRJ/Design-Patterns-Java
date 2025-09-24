package behavioral.observer;

import behavioral.observer.interfaces.Observer;

public class EmailService implements Observer {
    @Override
    public void consume() {
        System.out.println("EmailService: Sending email notification about Bitcoin price change.");
    }
}

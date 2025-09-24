package behavioral.observer.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::consume);
    }

}

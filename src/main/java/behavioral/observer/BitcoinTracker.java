package behavioral.observer;

import behavioral.observer.interfaces.Publisher;
import behavioral.observer.models.Bitcoin;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BitcoinTracker extends Publisher {

    private Bitcoin bitcoin;

    public void setPrice(Double price) {
        // Update the Bitcoin instance with the new price
        this.bitcoin = this.bitcoin //state change
                .toBuilder()
                .price(price)
                .build();
        // Notify all observers about the price change
        notifyObservers();
    }

}

package behavioral.strategy;

import behavioral.strategy.interfaces.NavigationStrategy;

//Step 2: Create concrete strategy classes implementing the strategy interface.
public class BikeNavigationStrategy implements NavigationStrategy {

    @Override
    public void navigate(String from, String to) {
        System.out.println("Navigating by bike from " + from + " to " + to);
    }
}

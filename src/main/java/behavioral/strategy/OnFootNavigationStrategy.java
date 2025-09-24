package behavioral.strategy;

import behavioral.strategy.interfaces.NavigationStrategy;

public class OnFootNavigationStrategy implements NavigationStrategy {

    @Override
    public void navigate(String from, String to) {
        System.out.println("Navigating on foot from " + from + " to " + to);
    }

}

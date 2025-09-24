package behavioral.strategy;

import org.junit.After;
import org.junit.Test;

public class NavigatorTest {

    private Navigator navigator;

    @After
    public void tearDown() {
        navigator = null;
    }

    @Test
    public void testNavigate_CarStrategy() {
        navigator = new Navigator(new CarNavigationStrategy());
        navigator.navigate("Point A", "Point B");
    }

    @Test
    public void testNavigate_BikeStrategy() {
        navigator = new Navigator(new BikeNavigationStrategy());
        navigator.navigate("Point A", "Point B");
    }

    @Test
    public void testNavigate_OnFootStrategy() {
        navigator = new Navigator(new OnFootNavigationStrategy());
        navigator.navigate("Point A", "Point B");
    }
}

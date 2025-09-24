package behavioral.strategy;

import behavioral.strategy.interfaces.NavigationStrategy;
import lombok.AllArgsConstructor;
import lombok.Setter;

/*Step 3: Create a context class that uses a strategy.
 * 1. The context class maintains a reference to a strategy object.
 * 2. The context class delegates the execution of the strategy to the strategy object.
 */
@Setter
@AllArgsConstructor
public class Navigator {

    private NavigationStrategy strategy;

    public void navigate(String from, String to) {
        strategy.navigate(from, to);
    }

}

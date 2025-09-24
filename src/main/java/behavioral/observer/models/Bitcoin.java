package behavioral.observer.models;

import lombok.Builder;
import lombok.Getter;

@Getter
//@Setter
/* toBuilder = true to allow modification of existing instances
 * without breaking immutability */
@Builder(toBuilder = true)
public class Bitcoin {
    private double price;
}

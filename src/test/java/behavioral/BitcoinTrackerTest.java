package behavioral;

import behavioral.observer.BitcoinTracker;
import behavioral.observer.EmailService;
import behavioral.observer.models.Bitcoin;
import org.junit.Before;
import org.junit.Test;

public class BitcoinTrackerTest {

    private BitcoinTracker bitcoinTracker;

    @Before
    public void setUp() {
        bitcoinTracker = new BitcoinTracker(Bitcoin.builder().price(50000.0).build());
        bitcoinTracker.subscribe(new EmailService());
    }

    @Test
    public void testPriceChange_EmailService() {
        bitcoinTracker.setPrice(51000.0);
        bitcoinTracker.setPrice(52000.0);
    }
}

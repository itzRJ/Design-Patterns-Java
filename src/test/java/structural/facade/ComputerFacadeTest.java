package structural.facade;

import org.junit.Test;
import structural.facade.client.ComputerClientInterface;

public class ComputerFacadeTest {

    @Test
    public void testComputerStartup() {
        ComputerClientInterface computer = new ComputerClientInterface();
        computer.turnOnComputer();
    }
}

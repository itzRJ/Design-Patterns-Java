package structural.facade;

import structural.facade.subsystems.BIOSService;
import structural.facade.subsystems.DiskService;
import structural.facade.subsystems.OSService;
import structural.facade.subsystems.PowerSupplyService;

/**
 * Facade class to simplify the interaction with complex subsystems
 * involved in turning on a computer.
 */
public class ComputerFacadeService {

    /**
     * This is a Facade class that simplifies the interaction with complex subsystems
     * involved in turning on a computer.
     */
    public void turnOnComputer() {
        System.out.println("Turning on the computer...");
        // Here you would typically call methods from various subsystems
        // For simplicity, we are just printing a message. In a real-world scenario, you would interact with
        // other subsystems like BIOSService, PowerSupplyService, and OSService
        // to perform the complex operations required to turn on the computer.
        PowerSupplyService.supplyPower();
        BIOSService.turnOnBios();
        OSService.loadOS();
        DiskService.loadDisk("C");
        DiskService.loadDisk("D");
        System.out.println("Computer is now ON.");
    }

}

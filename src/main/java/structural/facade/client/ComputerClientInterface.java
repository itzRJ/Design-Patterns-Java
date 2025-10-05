package structural.facade.client;

import structural.facade.ComputerFacadeService;

// Client interface to interact with the Computer Facade Service
public class ComputerClientInterface {

    // Instance of the facade service
    private ComputerFacadeService computerFacadeService;

    // Method to turn on the computer using the facade service
    public void turnOnComputer() {
        computerFacadeService = new ComputerFacadeService();
        computerFacadeService.turnOnComputer();
    }
}

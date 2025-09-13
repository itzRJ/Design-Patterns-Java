package creational.factory.factorymethod;

import creational.factory.button.Button;

//Step 3: create factory interface
public interface GenericButtonFactory {

    public Button createButton();

}

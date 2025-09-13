package creational.factory.factorymethod;

import creational.factory.button.Button;
import creational.factory.button.RoundButton;

//Step 4: create concrete factory classes
public class RoundButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {
        return new RoundButton();
    }

}

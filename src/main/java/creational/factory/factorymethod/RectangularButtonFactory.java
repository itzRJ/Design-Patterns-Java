package creational.factory.factorymethod;

import creational.factory.button.Button;
import creational.factory.button.RectagularButton;

public class RectangularButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {
        return new RectagularButton();
    }
}

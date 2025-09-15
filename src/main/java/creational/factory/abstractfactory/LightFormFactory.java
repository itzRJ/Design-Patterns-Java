package creational.factory.abstractfactory;

import creational.factory.button.Button;

public class LightFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}

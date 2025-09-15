package creational.factory.abstractfactory;

import creational.factory.button.Button;

//Step 4: implement concrete factories
//so this specific factory will ensure that the products that are returned are from 'Dark' family
public class DarkFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

package creational.factory.abstractfactory;

import creational.factory.button.Button;

//Step 3: create abstract factory interface
public interface FormFactory {

    //add factory methods for the products
    Button createButton();

    Checkbox createCheckbox();

}

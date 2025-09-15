package creational.factory;

import creational.factory.button.RectagularButton;
import creational.factory.factorymethod.GenericButtonFactory;
import creational.factory.factorymethod.RectangularButtonFactory;
import creational.factory.simplefactory.ButtonFactory;
import creational.factory.button.Button;
import creational.factory.button.PlatformType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ButtonFactoryTest
{

    private GenericButtonFactory factory;

    @Before
    public void setup()
    {
        factory = new RectangularButtonFactory();
    }

    @Test
    public void testButtonCreation()
    {
        Button button = ButtonFactory.createButton(PlatformType.ANDROID);
        Assert.assertNotNull("For android platform, button should not be null", button);
    }

    @Test
    public void testFactoryMethod()
    {
        Button button = factory.createButton();
        Assert.assertNotNull("Button should not be null as rectangular factory method is called.", button);
        Assert.assertTrue(button instanceof RectagularButton);
    }

}

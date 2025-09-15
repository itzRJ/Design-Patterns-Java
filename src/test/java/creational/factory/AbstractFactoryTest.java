package creational.factory;

import creational.factory.abstractfactory.*;
import creational.factory.button.Button;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    private FormFactory factory;

    @After
    public void deInitialize()
    {
        factory = null;
    }

    @Test
    public void testDarkFamily()
    {
        factory = new DarkFormFactory();

        Button darkBtn = factory.createButton();
        Assert.assertNotNull(darkBtn);
        Assert.assertTrue(darkBtn instanceof DarkButton);

        Checkbox darkCheckbox = factory.createCheckbox();
        Assert.assertNotNull(darkCheckbox);
        Assert.assertTrue(darkCheckbox instanceof DarkCheckbox);
    }

    @Test
    public void testLightFamily()
    {
        factory = new LightFormFactory();

        Button lightBtn = factory.createButton();
        Assert.assertNotNull(lightBtn);
        Assert.assertTrue(lightBtn instanceof LightButton);

        Checkbox lightCheckbox = factory.createCheckbox();
        Assert.assertNotNull(lightCheckbox);
        Assert.assertTrue(lightCheckbox instanceof LightCheckbox);
    }
}

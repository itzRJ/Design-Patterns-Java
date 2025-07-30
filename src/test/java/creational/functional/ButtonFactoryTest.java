package creational.functional;

import creational.factory.ButtonFactory;
import creational.factory.button.Button;
import creational.factory.button.PlatformType;
import org.junit.Assert;
import org.junit.Test;

public class ButtonFactoryTest
{
    @Test
    public void testButtonCreation()
    {
        Button button = ButtonFactory.createButton(PlatformType.ANDROID);
        Assert.assertNotNull("For android platform, button should not be null", button);
    }

}

package creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest
{
    @Test
    public void testSingletonInstance()
    {
        Singleton singleton = Singleton.getInstance();
        Assert.assertNotNull("Once called, instance should not be null. ", singleton);
    }
}

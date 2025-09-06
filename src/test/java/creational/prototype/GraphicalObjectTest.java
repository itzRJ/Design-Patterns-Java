package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class GraphicalObjectTest {

    @Test
    public void testCloneObject()
    {
        BackgroundObject o1 = new BackgroundObject(0, 0, 1, 1, BackgroundObjectType.BENCH);
        BackgroundObject clone = o1.clone();

        Assert.assertNotNull("Should not be null if works as expected", clone);
        Assert.assertEquals(clone.getX(), o1.getX());
        clone.setX(1);
        clone.setY(1);
        Assert.assertNotSame(clone, o1);//true because in clone we create new object
        Assert.assertNotSame(clone.getX(), o1.getX());
    }

}

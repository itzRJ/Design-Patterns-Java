package creational.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphicalObjectTest {

    private BackgroundRegistry<BackgroundObject, BackgroundObjectType> registry;

    @Before
    public void setup()
    {
        registry = new BackgroundRegistry<>();
        BackgroundObject tree = new BackgroundObject(1, 2, 3, 4, BackgroundObjectType.TREE);
        registry.register(BackgroundObjectType.TREE, tree);

        BackgroundObject bench = new BackgroundObject(0, 0, 1, 1, BackgroundObjectType.BENCH);
        registry.register(BackgroundObjectType.BENCH, bench);
    }

    @Test
    public void testCloneObject()
    {
        BackgroundObject o1 = registry.getBgEntity(BackgroundObjectType.BENCH);
        BackgroundObject clone = o1.clone();

        Assert.assertNotNull("Should not be null if works as expected", clone);
        Assert.assertEquals(clone.getX(), o1.getX());
        clone.setX(1);
        clone.setY(1);
        Assert.assertNotSame(clone, o1);//true because in clone we create new object
        Assert.assertNotSame(clone.getX(), o1.getX());
    }

    @Test
    public void testPrototypeWithRegistry()
    {
        BackgroundObject prototype = registry.getBgEntity(BackgroundObjectType.TREE);
        Assert.assertNotNull(prototype);

        BackgroundObject clone = prototype.clone();
        clone.setType(BackgroundObjectType.BUILDING);

        Assert.assertNotSame(prototype.getType(), clone.getType());

    }

}

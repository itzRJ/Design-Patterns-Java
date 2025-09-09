package creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseBuilderTest {

    @Test
    public void testBuilder()
    {
        Database database = Database.getBuilder()
                .withHost("localhost")
                .withName("test")
                .withPort(22)
                .withType(DatabaseType.POSTGRES)
                .build();

        Assert.assertNotNull(database);
        Assert.assertEquals("localhost", database.getHost());
    }
}

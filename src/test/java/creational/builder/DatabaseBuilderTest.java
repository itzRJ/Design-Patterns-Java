package creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseBuilderTest {

    @Test
    public void testBuilder()
    {
        Database sqlDb = Database.getBuilder()
                .withHost("localhost")
                .withName("test")
                .withPort(22)
                .withType(DatabaseType.POSTGRES)
                .build();

        Assert.assertNotNull(sqlDb);
        Assert.assertEquals("localhost", sqlDb.getHost());

        Database oracleDb = Database.getBuilder()
                .withHost("localhost")
                .withName("test")
                .withPort(22)
                .withOracle()
                .build();

        Assert.assertEquals(DatabaseType.ORACLE, oracleDb.getType());
    }
}

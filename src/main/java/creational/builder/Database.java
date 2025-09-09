package creational.builder;

import lombok.Getter;

@Getter
public class Database {

    private String name;

    private String host;

    private Integer port;

    private DatabaseType type;

    // Step 1 - Hide the constructor
    private Database(String name, String host, Integer port, DatabaseType type) {
        this.name = name;
        this.host = host;
        this.port = port;
        this.type = type;
    }

    public Database() {

    }

    public static DatabaseBuilder getBuilder()
    {
        return new DatabaseBuilder();
    }

    // Step 2 - Create a static inner class with same fields as the outer class
    public static class DatabaseBuilder {

        private Database database;

        DatabaseBuilder() {
            this.database = new Database();
        }

        // Step 3 - Create fluent interfaces for setter
        public DatabaseBuilder withName(String iName)
        {
            this.database.name = iName;
            return this;
        }

        public DatabaseBuilder withHost(String iHost)
        {
            this.database.host = iHost;
            return this;
        }

        public DatabaseBuilder withPort(Integer iPort)
        {
            this.database.port = iPort;
            return this;
        }

        public DatabaseBuilder withType(DatabaseType iType)
        {
            this.database.type = iType;
            return this;
        }

        // Step 4 - Create a build method to return the outer class object
        public Database build()
        {
            //can add validations before returning the database object
            return new Database(this.database.name, this.database.host, this.database.port, this.database.type);
        }

    }

}

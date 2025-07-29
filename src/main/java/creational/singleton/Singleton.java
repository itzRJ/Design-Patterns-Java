package creational.singleton;

/**
 * Sample class for Singleton Design Pattern
 */
public class Singleton {

    //private instance
    private static Singleton instance = null;

    //private constructor
    private Singleton(){
        //do nothing
    }

    //thread safe global access
    //for double checked locking, we have to use synchronized block instead of synchronized method
    public static synchronized Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();

        return instance;
    }
}

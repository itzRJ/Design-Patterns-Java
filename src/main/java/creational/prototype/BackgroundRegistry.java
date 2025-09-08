package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BackgroundRegistry {

    private Map<BackgroundObjectType, BackgroundObject> register =  new HashMap<>();

    public void register(BackgroundObjectType type, BackgroundObject object)
    {
        register.put(type, object);
    }

    public BackgroundObject getBgObj(BackgroundObjectType type)
    {
        return register.get(type);
    }

}

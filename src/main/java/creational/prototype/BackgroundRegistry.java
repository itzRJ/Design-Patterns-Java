package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BackgroundRegistry<ENTITY, TYPE> {

    private Map<TYPE, ENTITY> register =  new HashMap<>();

    public void register(TYPE type, ENTITY object)
    {
        register.put(type, object);
    }

    public ENTITY getBgEntity(TYPE type)
    {
        return register.get(type);
    }

}

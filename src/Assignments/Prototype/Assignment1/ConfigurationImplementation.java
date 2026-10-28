package Assignments.Prototype.Assignment1;

import java.util.HashMap;

public class ConfigurationImplementation implements ConfigurationPrototypeRegistry {


    HashMap<ConfigurationType,Configuration> map = new HashMap<>();
    @Override
    public void addPrototype(Configuration user) {

        map.put(user.getType(),user);

    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {


        return map.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) throws CloneNotSupportedException {
        return map.get(type).clone();
    }
}

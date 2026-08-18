package Assignments.Prototype.Assignment1;

public interface ConfigurationPrototypeRegistry {
    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type) throws CloneNotSupportedException;
}

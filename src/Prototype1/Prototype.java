package Prototype1;

public interface Prototype {
    Prototype clone();
    void setengine(CarEngine carEngine);
    void mode (int model);
}

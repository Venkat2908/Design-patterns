package Prototype1;

public abstract   class Car implements Prototype {
    String colour;
    int wheel;

    public Car(String colour,int wheel){
        this.colour = colour;
        this.wheel = wheel;
    }



    @Override
    public abstract Car clone();

    @Override
    public abstract void   setengine(CarEngine carEngine);

    @Override
    public abstract void mode(int model);
}

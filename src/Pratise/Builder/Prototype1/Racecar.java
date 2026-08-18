package Pratise.Builder.Prototype1;

public class Racecar extends Car {

    int model;
    CarEngine carEngine;

    public  Racecar(){
        super("red",4);
        this.model = 2020;
        this.carEngine = new CarEngine();
    }

    private Racecar(CarEngine carEngine,int model){
        super("red",4);
        this.carEngine = new CarEngine(carEngine);
        this.model = model;
    }
    @Override
    public Racecar clone() {
        return new Racecar(this.carEngine,this.model);
    }

    @Override
    public void setengine(CarEngine carEngine) {
        this.carEngine= carEngine;

    }

    @Override
    public void mode(int model) {
        this.model = model;

    }
}

package Prototype1;

public class VintageCar extends Car {

    int model;
    CarEngine carEngine;

    public VintageCar() {
        super("white", 4);
        this.model = 2025;
        this.carEngine = new CarEngine();
    }

    private VintageCar(CarEngine carEngine,int model) {
        super("white", 4);
        this.model = 2025;
        this.carEngine = new CarEngine(carEngine);
    }

    @Override
    public VintageCar clone() {
        return new VintageCar(this.carEngine,this.model);
    }

    @Override
    public void setengine(CarEngine carEngine) {
        this.carEngine = carEngine;

    }

    @Override
    public void mode(int model) {
        this.model = model;

    }
}

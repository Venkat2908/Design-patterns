package Pratise.Builder.Builder1;

public class SportscardBuilder implements CarBuilder {

    private final Car car;

    public SportscardBuilder(){
        car = new Car();
    }

    @Override
    public void buildwheels() {
        car.setWheels("alloy");

    }

    @Override
    public void buildseats() {
        car.setSeats("racing Seats");

    }

    @Override
    public void buildEngine() {
        car.setEngine("v8");

    }

    @Override
    public void buildColour() {
        car.setColor("red");

    }

    @Override
    public Car getcar() {
        return car;
    }
}

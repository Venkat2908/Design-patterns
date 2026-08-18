package Pratise.Builder.Abstarctfactory.Example2;

public class Civic extends  Car {
    public Civic(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void drive() {
        System.out.println("You are driving Honda Civic");

    }
}

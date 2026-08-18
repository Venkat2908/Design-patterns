package Pratise.Builder.Abstarctfactory.Example2;

public class Breeza extends Car {
    public Breeza(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void drive() {

        System.out.println("You are driving Suzuki Breeza");

    }
}

package Pratise.Builder.Abstarctfactory.Example2;

public class Balaneo extends Car {
    public Balaneo(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void drive() {
        System.out.println("you are driving Suzuki balaneo");

    }
}

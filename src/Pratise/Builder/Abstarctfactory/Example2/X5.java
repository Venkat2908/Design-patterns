package Pratise.Builder.Abstarctfactory.Example2;

public class X5 extends Car {
    public X5(String model, String brand) {
        super("X5", "BMW");
    }

    @Override
    public void drive() {
        System.out.println("you are driving BMW X5");

    }
}

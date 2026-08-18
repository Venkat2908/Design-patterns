package Pratise.Builder.Abstarctfactory.Example2;

public class X1 extends Car {
    public X1(String model, String brand) {
        super("X1", "BMW");
    }

    @Override
    public void drive() {
        System.out.println("You are driving BMW X1");

    }
}

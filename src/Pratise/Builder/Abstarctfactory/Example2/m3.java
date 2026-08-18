package Pratise.Builder.Abstarctfactory.Example2;

public class m3 extends Car {
    public m3(String model, String brand) {
        super("M3", "BMW");
    }

    @Override
    public void drive() {
        System.out.println("You are driving BMW M3");

    }
}

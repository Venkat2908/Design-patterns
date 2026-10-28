package Pratise.Builder.Abstarctfactory.Example2;

public class City extends Car {
    public City(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void drive() {
        System.out.println("you are driving honda city");
    }
}

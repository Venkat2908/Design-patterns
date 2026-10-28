package Pratise.Builder.Abstarctfactory.Example2;

public class Swift extends Car {
    @Override
    public void drive() {
        System.out.println("you are driving suzuki swift");

    }

    public Swift(String model, String brand) {
        super("Swift", "Suzuki");
    }
}

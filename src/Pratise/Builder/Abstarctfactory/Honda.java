package Pratise.Builder.Abstarctfactory;

public class Honda implements Vehicle {
    @Override
    public void start() {
        System.out.println("the Honda started");
    }

    @Override
    public void stop() {
        System.out.println("the Honda Stopped");
    }
}

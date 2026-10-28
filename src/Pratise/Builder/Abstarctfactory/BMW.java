package Pratise.Builder.Abstarctfactory;

public class BMW implements Vehicle{
    @Override
    public void start() {
        System.out.println("the BMW Started");
    }

    @Override
    public void stop() {
        System.out.println("The BMW Stopped");

    }
}

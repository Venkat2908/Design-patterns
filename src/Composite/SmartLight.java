package Composite;

public class SmartLight implements Smartcomponent {
    @Override
    public void turnon() {
        System.out.println("SmartLight turned on");

    }

    @Override
    public void turnoff() {
        System.out.println("SmartLight turned off");

    }
}

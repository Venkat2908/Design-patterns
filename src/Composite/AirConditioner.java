package Composite;

public class AirConditioner implements Smartcomponent {
    @Override
    public void turnon() {
        System.out.println("Air conditioner turned on");
    }

    @Override
    public void turnoff() {
        System.out.println("Air conditioner turned off");

    }
}

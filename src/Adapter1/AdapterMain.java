package Adapter1;

public class AdapterMain {
    public static void main(String[] args) {

        smartdevice Airconditioner = new AirconditionerAdapter(new AirConditioner() );
        Airconditioner.turnon();
        Airconditioner.turnoff();

    }
}

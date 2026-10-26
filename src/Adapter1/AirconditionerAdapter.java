package Adapter1;

public class AirconditionerAdapter implements smartdevice {

    private AirConditioner airconditioner;
    public AirconditionerAdapter(AirConditioner airconditioner){
        this.airconditioner = airconditioner;
    }
    @Override
    public void turnon() {
        airconditioner.connectviabluetooth();
        airconditioner.startCooling();

    }

    @Override
    public void turnoff() {
        airconditioner.stopCooling();
        airconditioner.DisconnectBluetooth();

    }
}

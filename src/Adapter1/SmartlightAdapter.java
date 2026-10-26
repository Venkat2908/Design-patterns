package Adapter1;

public class SmartlightAdapter implements smartdevice {

    private smartlight  smartlight;
    public SmartlightAdapter(smartlight smartlight) {
        this.smartlight = smartlight;
    }
    @Override
    public void turnon() {
        smartlight.connecttowifi();
        smartlight.Switchon();

    }

    @Override
    public void turnoff() {
        smartlight.disconnecttowifi();
        smartlight.Switchoff();

    }
}

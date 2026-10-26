package State;

public class Greenstate implements StateInterface {
    @Override
    public void next(TrafficLightcontext trafficLight) {
        System.out.println("turning green to yellow");
        trafficLight.setState(new Yellowstate());

    }

    @Override
    public String getcolour() {
        return "green";
    }
}

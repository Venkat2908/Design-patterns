package State;

public class Redstate implements StateInterface {


    @Override
    public void next(TrafficLightcontext trafficLight) {
        System.out.println("turning redstate to greeen cars can goo");
        trafficLight.setState (new Greenstate());

    }

    @Override
    public String getcolour() {
        return "RED";
    }
}

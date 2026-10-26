package State;

public class Yellowstate implements StateInterface {
    @Override
    public void next(TrafficLightcontext trafficLight) {

        System.out.println("Yellow to redstate can goo");
        trafficLight.setState(new Redstate());

    }

    @Override
    public String getcolour() {
        return "yellow";
    }
}

package State;

public class TrafficLightcontext {
    private StateInterface state;
    public TrafficLightcontext() {
        this.state = new Redstate();
    }

    public void setState(StateInterface state) {
        this.state = state;
    }



    public void next(){
        state.next(this);
    }


    public String getcolour(){
        return state.getcolour();
    }

}

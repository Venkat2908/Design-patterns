package Pratise.Builder.Observer;

public class phonedisplay implements Observer {
    private String name;
    public phonedisplay(String name){
        this.name= name;
    }
    @Override
    public void update(int temperature) {
        System.out.println(name +"the temperature updated to "+temperature);
    }
}

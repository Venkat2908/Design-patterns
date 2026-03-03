package Builder;

public class Client {
    public static  void main (String [] args){
        CarBuilder carBuilder = new SportscardBuilder();
        Director director = new Director(carBuilder);

       Car car= director.constructcar(true);
        car.toString();
    }
}

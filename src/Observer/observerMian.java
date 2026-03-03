package Observer;

public class observerMian {
    public static  void main (String [] args){
        Weatherstation station = new Weatherstation();
        phonedisplay phon1= new phonedisplay("phone1");
        phonedisplay phone2= new phonedisplay("phone2");

        station.addobserver(phon1);
        station.addobserver(phone2);

        station.setTemperature(30);
        station.setTemperature(35);

    }
}

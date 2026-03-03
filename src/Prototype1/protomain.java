package Prototype1;

public class protomain {
    public static  void main (String [] args){
        Racecar racecar  = new Racecar();
        VintageCar vintageCar = new VintageCar();

        Racecar clonedracecar = racecar.clone();
        VintageCar clonedVintagecar = vintageCar.clone();
        System.out.println(clonedracecar.model);
        System.out.println(clonedVintagecar.model);
    }
}

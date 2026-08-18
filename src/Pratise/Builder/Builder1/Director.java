package Pratise.Builder.Builder1;

public class Director {
    private  final CarBuilder builder;

    public Director(CarBuilder builder){
        this.builder = builder;
    }


    public Car constructcar(boolean wantcolour){
        if(wantcolour){
            builder.buildColour();
        }
        builder.buildwheels();
        builder.buildEngine();
        builder.buildseats();
         return builder.getcar();
    }
}

package Composite;

public class CompositeMain {
    public static void main(String[] args) {

        Smartcomponent aircondition = new AirConditioner();
        Smartcomponent smartlight = new SmartLight();


        CompositeSmartcomponent room = new CompositeSmartcomponent();
        room.addcomponenet(aircondition);
        room.addcomponenet(smartlight);


        CompositeSmartcomponent room1 = new CompositeSmartcomponent();
        room1.addcomponenet(new AirConditioner());
        room1.addcomponenet(new SmartLight());



        CompositeSmartcomponent floor = new CompositeSmartcomponent();
        floor.addcomponenet(room1);
        floor.addcomponenet(room);

        CompositeSmartcomponent house = new CompositeSmartcomponent();
        house.addcomponenet(floor);

        house.turnon();
        house.turnoff();


    }
}

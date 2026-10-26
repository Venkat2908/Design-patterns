package Adapter1;

public class CoffeemachineAdapter implements smartdevice {

    private CoffeeMachine coffeeMachine;
    public CoffeemachineAdapter(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;

    }
    @Override
    public void turnon() {
        coffeeMachine.InitliaizeZigbeeconnection();
        coffeeMachine.startbreqing();


    }

    @Override
    public void turnoff() {
        coffeeMachine.stopbreqing();
        coffeeMachine.terminateZigbeeconnection();

    }
}

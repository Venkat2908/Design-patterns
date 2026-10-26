package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartcomponent implements Smartcomponent {

    private List<Smartcomponent> smart = new ArrayList<>();

    public void addcomponenet(Smartcomponent smartcomponent) {
        smart.add(smartcomponent);
    }

    public void removecomponenet(Smartcomponent smartcomponent) {
        smart.remove(smartcomponent);

    }

    @Override
    public void turnon() {
        for (Smartcomponent smartcomponent : smart) {
            smartcomponent.turnon();
        }

    }

    @Override
    public void turnoff() {
        for (Smartcomponent smartcomponent : smart) {
            smartcomponent.turnoff();
        }

    }


}

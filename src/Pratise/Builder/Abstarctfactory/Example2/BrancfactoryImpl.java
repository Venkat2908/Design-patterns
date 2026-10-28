package Pratise.Builder.Abstarctfactory.Example2;

public class BrancfactoryImpl implements BrandFactory {
    @Override
    public CarFactory createfactory(Brandmodel brandmodel) {
        switch (brandmodel){
            case brandmodel.BMW -> {
                return new BMWFactory();

            }
            case brandmodel.HONDA -> {
                return new HondaFactory();
            }
            case SUZUKI -> {
                return new SuzukiFactory();
            }
            default -> throw new IllegalArgumentException("unknow brand");
        }

    }
}

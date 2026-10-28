package Assignments.Strategy.Assignement1;

public class PricingManager {

    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    private PricingType pricingType;

    public PricingManager(PricingType pricingType){
        this.pricingType= pricingType;
    }

    public  Double calculateride(RideDetails rideDetails){
        pricingStrategy = PricingStartegyFactory.createfactory(pricingType);

        return  pricingStrategy.calculate(rideDetails);

    }

    public String getsupporttype(){
        pricingStrategy = PricingStartegyFactory.createfactory(pricingType);

        return pricingStrategy.supporttype().toString();
    }


}

package Assignments.Strategy.Assignement1;

public class PricingStartegyFactory {
    public static PricingStrategy createfactory (PricingType pricingType){
       return switch (pricingType){
            case SURGE -> new SurgePricingStrategy();
            case TIME_BASED -> new TimebasedpricingStrategy();
            case DISTANCE_BASED -> new DistanceBasedPricingStrategy();
        };
    }
}

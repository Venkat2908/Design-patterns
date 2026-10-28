package Assignments.Strategy.Assignement1;

import java.util.concurrent.TimeUnit;

public class PricingMain {
    public  static  void main (String [] args){
        RideDetails rideDetails = new RideDetails();
        rideDetails.setDistance(120);
        rideDetails.setDuration(20);
        PricingManager p1 = new PricingManager(PricingType.DISTANCE_BASED);
        System.out.println(p1.calculateride(rideDetails));

       System.out.println( p1.getsupporttype());

       PricingManager p2 = new PricingManager(PricingType.TIME_BASED);

        System.out.println(p2.calculateride(rideDetails));

        System.out.println( p2.getsupporttype());




    }
}

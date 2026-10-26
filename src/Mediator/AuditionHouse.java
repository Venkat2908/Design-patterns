package Mediator;


import java.util.ArrayList;
import java.util.List;

public class AuditionHouse implements AuctionMeditor {

    private List<Bidder> bidders = new ArrayList<>();
    @Override
    public void Register(Bidder bid) {
        bidders.add(bid);

    }

    @Override
    public void notifybidders(int  Amount , Bidder bid) {
        for (Bidder b : bidders) {

            if (b!=bid){
                System.out.println("The name of the Bidder is "+bid.getName() +" and the amount is"+ Amount +
                        "And it was bidded towards  "+b.getName());
            }


        }

    }
}

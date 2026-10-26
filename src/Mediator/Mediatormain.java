package Mediator;

public class Mediatormain {
    public static void main(String[] args) {
        AuctionMeditor meditor = new AuditionHouse();
        Bidder bid = new Bidder("venkat",meditor);
        Bidder bid1 = new Bidder("raman",meditor);
        Bidder bid2 = new Bidder("daniel",meditor);

        meditor.Register(bid);
        meditor.Register(bid1);
        meditor.Register(bid2);

        meditor.notifybidders(100,bid);
        meditor.notifybidders(300,bid1);
        meditor.notifybidders(200,bid2);
    }
}

package Mediator;

public class Bidder {

    private String name;
    private AuctionMeditor auctionMeditor;

    public Bidder(String name, AuctionMeditor auctionMeditor) {
        this.name = name;
        this.auctionMeditor = auctionMeditor;
    }

    public String getName() {
        return name;
    }

    public AuctionMeditor getAuctionMeditor() {
        return auctionMeditor;
    }

    public void placebid(int amount) {
        auctionMeditor.notifybidders(amount, this);
    }

    public void receiveBid(Bidder bidder, int amount) {
        System.out.println(name + " is notified: " + bidder.getName() +
                " placed a bid of " + amount);
    }
}

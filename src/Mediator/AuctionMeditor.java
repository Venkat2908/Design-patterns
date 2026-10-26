package Mediator;

public interface AuctionMeditor {

    void Register(Bidder bid);
    void notifybidders(int amount, Bidder bid);
}

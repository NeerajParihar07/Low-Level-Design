package MediatorDesignPattern;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator ac){
        this.name = name;
        this.auctionMediator = ac;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this, amount);
    }


    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder " + this.name +" got the notification for this amount " + bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}

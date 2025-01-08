package MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague Bidder, int amount) {
        for(Colleague col : colleagues)
        {
            if(!col.getName().equals(Bidder.getName())){
                col.receiveBidNotification(amount);
            }
        }
    }
}

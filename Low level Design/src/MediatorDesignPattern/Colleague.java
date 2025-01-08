package MediatorDesignPattern;

public interface Colleague {
    public void placeBid(int amount);
    public void receiveBidNotification(int bidAmount);
    public String getName();
}

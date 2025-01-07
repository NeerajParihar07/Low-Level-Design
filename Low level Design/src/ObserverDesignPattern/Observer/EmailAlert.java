package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlert implements NotificationAlertObserver {

    String emailId;
    StockObservable observable;

    public EmailAlert(String id, StockObservable ob)
    {
        this.observable = ob;
        emailId = id;
    }

    @Override
    public void update() {
        System.out.println("Sending Email alert " + emailId);
    }
}

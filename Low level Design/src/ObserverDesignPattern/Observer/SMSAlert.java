package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class SMSAlert implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public SMSAlert(String id, StockObservable obj){
        userName = id;
        observable= obj;
    }

    @Override
    public void update() {
        System.out.println("SMS Alert Generated " + userName);
    }
}

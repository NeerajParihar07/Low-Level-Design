package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImple;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlert;
import ObserverDesignPattern.Observer.NotificationAlertObserver;
import ObserverDesignPattern.Observer.SMSAlert;

public class Store {
    public static void main(String[] args) {
        StockObservable iphonObservable = new IphoneObservableImple();

        NotificationAlertObserver obs1 = new EmailAlert("raju", iphonObservable); // constructor injection
        NotificationAlertObserver obs2 = new EmailAlert("joe", iphonObservable);
        NotificationAlertObserver obs3 = new SMSAlert("Andy", iphonObservable);

        iphonObservable.add(obs1);
        iphonObservable.add(obs2);
        iphonObservable.add(obs3);

        iphonObservable.setStockCount(10);
    }
}

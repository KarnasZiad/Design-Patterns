package observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2(); 

        observable.subscribe(obs1);
        observable.subscribe(obs2);
        observable.notifyAllObservers();
    }
}
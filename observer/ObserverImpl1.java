package observer;

public class ObserverImpl1 implements Observer{
    private  int observerState;

    @Override
    public void update(int newState) {
        this.observerState = newState;
        System.out.println("---------- i am the observer 1, my state is  updated " + observerState + "------------");
    }
    
}

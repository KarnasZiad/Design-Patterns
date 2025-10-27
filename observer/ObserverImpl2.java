package observer;

public class ObserverImpl2 implements Observer{
    private  int observerState;

    @Override
    public void update(int newState) {
        this.observerState = newState;
        System.out.println("---------- i am the observer 2, my state is updated " + observerState + "------------");
    }
}

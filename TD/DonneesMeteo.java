package TD.observerTD;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DonneesMeteo {

    private List<Observer> observers;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo(float t,float h,float p){
        temperature = t;
        humidite = h;
        pression = p;
        this.observers = new ArrayList<>();
    }

    public void actualiserMesures() {
        System.out.println("data is up to date ");
        Random random = new Random();
        temperature += random.nextFloat() * 15 - 10;
        humidite += random.nextFloat() * 20 - 10;
        humidite += random.nextFloat() * 20 - 10;
        notifiyObservers();
    }

    public void addObserver(Observer obs){
        this.observers.add(obs);
    }

    public void notifiyObservers(){
        observers.stream().forEach(obs-> obs.update(temperature, humidite, pression));
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }

}
package TD.observerTD;

import java.util.ArrayList;
import java.util.List;

public class StatistiquesObserver implements Observer{

    private List<Float> listOftemp;
    private List<Float> listOfHumidite;
    private List<Float> listOfPressions;

    public StatistiquesObserver(){
        this.listOfHumidite = new ArrayList<>();
        this.listOfPressions = new ArrayList<>();
        this.listOftemp = new ArrayList<>();
    }

    @Override
    public void update(float temperature,float humidite,float pression) {
        System.out.println("-----statistics updated");
        listOftemp.add(temperature);
        listOfHumidite.add(humidite);
        listOfPressions.add(pression);
        System.out.println("data was updated");
    }

    @Override
    public void displaydata(){
        System.out.println("--------------stats---------------");
        System.out.println("stats temperature = "+listOftemp);
        System.out.println("stats humidity = "+listOfHumidite);
        System.out.println("stats pression = "+listOfPressions);
        System.out.println("-------------stats----------------");
    }
    
}

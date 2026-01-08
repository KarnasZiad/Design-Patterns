package TD.observerTD;

import java.util.Random;

public class PrevisionsObserver implements Observer{

    private float predictedTemp;
    private float predictedHum;
    private float predictedPress;

    @Override
    public void update(float temperature, float humidite, float pression) {
        System.out.println("-----previsions updated");
        Random r = new Random();
        this.predictedHum = humidite + r.nextFloat()*10-5;
        this.predictedPress = pression + r.nextFloat()*10-5;
        this.predictedTemp = temperature + r.nextFloat()*10-5;
    }

    @Override
    public void displaydata(){
        System.out.println("--------------predictions---------------");
        System.out.println("P temperature = "+predictedTemp);
        System.out.println("P humidity = "+predictedHum);
        System.out.println("P pression = "+predictedPress);
        System.out.println("-------------predictions----------------");
    }
    
}

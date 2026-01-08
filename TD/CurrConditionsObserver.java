package TD.observerTD;

public class CurrConditionsObserver implements Observer{

    private float currTemp;
    private float currHum;
    private float currPress;

    @Override
    public void update(float temperature, float humidite, float pression) {
        System.out.println("-----curr conditions updated");
        this.currHum = humidite;
        this.currPress = pression;
        this.currTemp = temperature;
    }

    public void displaydata(){
        System.out.println("-------------curr----------------");
        System.out.println("temperature = "+currTemp);
        System.out.println("humidity = "+currHum);
        System.out.println("pression = "+currPress);
        System.out.println("--------------curr---------------");
    }
        
}

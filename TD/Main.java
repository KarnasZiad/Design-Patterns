package TD.observerTD;

public class Main {
    public static void main(String[] args) {
        DonneesMeteo donneesMeteo = new DonneesMeteo(33,20,123);
        
        Observer StatistiquesObserver = new StatistiquesObserver();
        Observer CurrConditionsObserver = new CurrConditionsObserver();
        Observer PrevisionsObserver = new PrevisionsObserver();

        donneesMeteo.addObserver(PrevisionsObserver);
        donneesMeteo.addObserver(CurrConditionsObserver);
        donneesMeteo.addObserver(StatistiquesObserver);

        donneesMeteo.actualiserMesures();
        
        StatistiquesObserver.displaydata();
        CurrConditionsObserver.displaydata();
        PrevisionsObserver.displaydata();
    }
}

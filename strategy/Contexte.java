package strategy;

public class Contexte {
    protected Strategy strategy;

    void setStrategie(Strategy str){
        this.strategy = str;
    }

    void effectuerStrategy(){
        strategy.operationStrategy();
    }
}

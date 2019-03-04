package adapter;

public class connectCharger {
    
    Charger charger;

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }
    
    public void ConnectCharger()
    {
        charger.putCharge();
    }
    
}

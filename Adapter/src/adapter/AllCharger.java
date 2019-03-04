package adapter;

public class AllCharger implements Charger{

    SamsungCharger sc=new SamsungCharger();
    @Override
    public void putCharge() {
        sc.connectSamsungCharger();
    }
    
}

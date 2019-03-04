package adapter;

public class iPhoneCharger implements Charger{

    @Override
    public void putCharge() {
        System.out.println("iPhone charger is connected...");
    }
    
}

class SamsungCharger
{
    public void connectSamsungCharger()
    {
        System.out.println("Samsung Charger is connected...");
    }
}

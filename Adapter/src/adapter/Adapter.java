package adapter;
public class Adapter 
{
    public static void main(String[] args) {
        Charger iPhoneCharger = new AllCharger();
        connectCharger cc = new connectCharger();
        
        cc.setCharger(iPhoneCharger);
        cc.ConnectCharger();
    }
}

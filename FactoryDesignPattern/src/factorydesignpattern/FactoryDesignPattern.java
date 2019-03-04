package factorydesignpattern;
public class FactoryDesignPattern {
/*Factory Design Pattern provides an interface for creating objects and 
allows to decide which class to instanciate.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //using factory design pattern
        OSFactory osf=new OSFactory();
        OS ob= osf.getInstance("open");
        ob.spec();
        OS ob2= osf.getInstance("close");
        ob2.spec();
        OS ob3= osf.getInstance("else");
        ob3.spec();
        //********************************
        
        //normal
        OS obj=new android();
        obj.spec();
        OS obj2=new ios();
        obj2.spec();
        OS obj3=new windows();
        obj3.spec();
        
        
    }   
}

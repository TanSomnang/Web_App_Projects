/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author MSI
 */
public class SingleTon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EarlySingleTon s=EarlySingleTon.getInstance();
        EarlySingleTon s1=EarlySingleTon.getInstance();
        
        LazySingleTon s2=LazySingleTon.getInstance();
        LazySingleTon s3=LazySingleTon.getInstance();
        
        s.print();
        s1.print();
        
        s2.print();
        s3.print();

        
    }
    
}

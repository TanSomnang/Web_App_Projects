package singleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI
 */
//create at load time
public class EarlySingleTon {
    
    //private member
    private static EarlySingleTon early=new EarlySingleTon();
    private static Object Lock=new Object();
    //private constructor
    private EarlySingleTon()
            {
                System.out.println("From Early SingleTon Constructor");
            }
    public void print()
    {
        System.out.println("From early print()");
    }
    
    public static EarlySingleTon getInstance()
    {
        synchronized(Lock)
        {
            System.out.println(early.hashCode());
            return early;
        }
    }
}

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
//create when required
public class LazySingleTon {
    private static LazySingleTon lazy=null;
    private LazySingleTon()
    {
        System.out.println("From Late Constructor");
    }
    public void print()
    {
        System.out.println("from late print()");
    }
    
    public static LazySingleTon getInstance()
    {
        if(lazy==null)
        {
            lazy=new LazySingleTon();
        }
        return lazy;
            
    }
}

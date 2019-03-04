/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MSI
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public void startComputer()
    {
        startCPU obj=new startCPU();
        startScreen obj1=new startScreen();
        obj.startCPU();
        obj1.startScreen();
    }
    
}

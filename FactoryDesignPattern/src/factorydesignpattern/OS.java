/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author MSI
 */
public interface OS {
    public void spec();
}

class android implements OS
{

    @Override
    public void spec() {
        System.out.println("Android");
    }
    
}

class ios implements OS
{

    @Override
    public void spec() {
        System.out.println("IOS");
    }
    
}

class windows implements OS
{

    @Override
    public void spec() {
        System.out.println("Windows");
    }
    
}

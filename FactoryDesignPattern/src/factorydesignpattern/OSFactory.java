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
public class OSFactory {
    public OS getInstance(String str)
    {
        if(str.equals("open"))
        {
            return new ios();
        }
        
        else if(str.equals("close"))
        {
            return new android();
        }
        
        else
        {
            return new windows();
        }
    }
}

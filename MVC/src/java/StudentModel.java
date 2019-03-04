/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI
 */
public class StudentModel {
    String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public boolean checkValues(StudentModel sm)
    {
        if(sm.getUser().equalsIgnoreCase("Somnang"))
        {
            return true;
        }
        else
            return false;
    }
}

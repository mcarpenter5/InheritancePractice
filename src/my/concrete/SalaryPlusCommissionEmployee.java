/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Michael Carpenter
 */
public class SalaryPlusCommissionEmployee extends Employee {
    
    
    public SalaryPlusCommissionEmployee(){
        
    }
    @Override
    public void pay(){
        System.out.println("I am salary paid + commission!");
    }
    //Unique to this class, they have to being doughnuts to the meetings
    public String doughnuts(){
        return"I'll get the doughnuts!";
    }
}

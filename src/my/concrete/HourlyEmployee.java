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
public class HourlyEmployee extends Employee {
    
    
    public HourlyEmployee(){
        
    }
    public HourlyEmployee(int age, String name, String IdNumber) {
        super(age, name, IdNumber);
    }
    //Overrides the pay to hourly
    @Override
    public void pay(){
        System.out.println("I am paid hourly");
    }
    
    //Unique to hourly employee's they have to bring the coffee
    public String coffee(){
        return "coffee";
    }
}

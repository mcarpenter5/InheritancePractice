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
public class SalariedEmployee extends Employee {
    
    
    public SalariedEmployee(){
        
    }
    public SalariedEmployee(int age, String name, String IdNumber) {
        super(age, name, IdNumber);
    }
    //Overriding the pay method
    @Override
    public void pay(){
        System.out.println("I am salary paid");
    }
    //Unique to this class, they have to bring the lunch for the meetings
    public String lunch(){
        return "lunch";
    }
}

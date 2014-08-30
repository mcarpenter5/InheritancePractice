/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author dominicalaus
 */
public class HourlyEmployee extends Employee {
    public HourlyEmployee(){
        
    }
    public HourlyEmployee(int age, String name, String IdNumber) {
        super(age, name, IdNumber);
    }
    
    @Override
    public void pay() {
        System.out.println("Hourly");
    }
    public String coffee(){
        return "coffee";
    }
}

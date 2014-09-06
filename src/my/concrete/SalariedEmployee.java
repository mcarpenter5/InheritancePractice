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
    private double annualSalary;
    
    public SalariedEmployee(){
        
        
    }

    public SalariedEmployee(int age, String name, String IdNumber,double annualSalary) {
        super(age, name, IdNumber);
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    //Overriding the pay method
    @Override
    public void getPay(){
        System.out.println("I am salary paid");
    }
    //Unique to this class, they have to bring the lunch for the meetings
    public String lunch(){
        return "lunch";
    }
}

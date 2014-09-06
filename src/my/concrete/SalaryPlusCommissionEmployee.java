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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    
   private double commission;

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
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

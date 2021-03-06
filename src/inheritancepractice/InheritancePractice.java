/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;

import my.concrete.Employee;
import my.concrete.HourlyEmployee;
import my.concrete.SalariedEmployee;
import my.concrete.SalaryPlusCommissionEmployee;

/**
 *
 * @author dominicalaus
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hourly Employee
        HourlyEmployee b = new HourlyEmployee();
        b.setAge(25);
        b.setName("Bob Johnson");
        b.setIdNumber("09090");
        String coff = b.coffee();
        System.out.println("Hi, my name is" + " " + b.getName() + " " 
                + ",My ID number is" + " " + b.getIdNumber() + " "+ " " 
                + ",My age is" + " " + " " + b.getAge()+ " " 
                + ",and I bring"+" " + coff +" "+ "to company meetings");
        System.out.println("How are you paid in this company? Says the Manager.");
        System.out.println(b.getName() + " " + "Replies...");
        b.getPay();
        
        
        //Salaried Employee
        SalariedEmployee s = new SalariedEmployee();
        s.setAge(40);
        s.setName("Sally Doe");
        s.setIdNumber("080808");
        String lun = s.lunch();
        System.out.println("Hi, my name is" + " " + s.getName() + " " 
                + ",My ID number is" + " " + s.getIdNumber() + " "+ " " 
                + ",My age is" + " " + " " + s.getAge()+ " " 
                + ",and I bring"+" " + lun +" "+ "to company meetings");
        System.out.println("How are you paid in this company? Says the Manager.");
        System.out.println(s.getName() + " " + "Replies...");
        s.getPay();
        s.setAnnualSalary(50000);
        System.out.println(s.getAnnualSalary() + " " + "is my salary ");
        
        
        
        SalaryPlusCommissionEmployee c = new SalaryPlusCommissionEmployee();
        c.setAge(40);
        c.setName("Jill Johnson");
        c.setIdNumber("070707");
        String dou = c.doughnuts();
        System.out.println("Hi, my name is" + " " + c.getName() + " " 
                + ",My ID number is" + " " + c.getIdNumber() + " "+ " " 
                + ",My age is" + " " + " " + c.getAge()+ " " 
                + ",and I bring"+" " + dou +" "+ "to company meetings");
        System.out.println("How are you paid in this company? Says the Manager.");
        System.out.println(c.getName() + " " + "Replies...");
        c.getPay();
        
                
        
    }
    
}

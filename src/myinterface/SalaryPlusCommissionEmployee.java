/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author dominicalaus
 */
public class SalaryPlusCommissionEmployee implements Employee {
    private int age;
    private String name;
    private String IdNumber;
    
    public SalaryPlusCommissionEmployee(){
    }
    
    public SalaryPlusCommissionEmployee(int age, String name, String IdNumber) {
        this.age = age;
        this.name = name;
        this.IdNumber = IdNumber;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getPay() {
        System.out.println("I am salary paid");
    }

    @Override
    public String getIdNumber() {
        return IdNumber;
    }

    @Override
    public void setIdNumber(String IdNumber) {
        this.IdNumber=IdNumber;
    }
    public void doughnuts (){
        System.out.println("doughnuts");
    }
}

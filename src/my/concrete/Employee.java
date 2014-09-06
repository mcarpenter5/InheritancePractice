/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author dominicalaus
 */
public class Employee {
    private int age;
    private String name;
    private String IdNumber;
    
    public Employee(){
    
}

    public Employee(int age, String name, String IdNumber) {
        this.age = age;
        this.name = name;
        this.IdNumber = IdNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }
    public void getPay(){
        System.out.println("Depends on what employee am I....");
    }
}

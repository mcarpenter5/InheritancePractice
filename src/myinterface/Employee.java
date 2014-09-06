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
public interface Employee {
    public abstract void getPay();
    
    public abstract int getAge();

    public abstract void setAge(int age);

    public abstract String getName();

    public abstract void setName(String name);
    
    public abstract String getIdNumber();
    
    public abstract void setIdNumber(String IdNumber);
}

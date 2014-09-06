/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;

import myabstract.Employee;
import myabstract.HourlyEmployee;
import myabstract.SalariedEmployee;
import myabstract.SalaryPlusCommissionEmployee;

public class AbstractPractice {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Employee [] employee = {
        new HourlyEmployee(30,"John Smith","090909"),
        new SalariedEmployee(40,"Sally Doe","080808"),
        new SalaryPlusCommissionEmployee(25,"Phil Johnson","070707")
    };
    
    for(Employee e : employee) {
        e.getPay();
    }
    }
}

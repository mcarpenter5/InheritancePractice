


package inheritancepractice;



import myinterface.Employee;
import myinterface.HourlyEmployee;
import myinterface.SalariedEmployee;
import myinterface.SalaryPlusCommissionEmployee;


/**
 *
 * @author dominicalaus
 */
public class Example2 {
    public static void main(String[] args) {
    Employee [] employee = {
        new HourlyEmployee(30,"John Smith","090909"),
        new SalariedEmployee(40,"Sally Doe","080808"),
        new SalaryPlusCommissionEmployee(25,"Phil Johnson","070707")
    };
    
    for(Employee e : employee) {
        e.pay();
    }
    }
}

/*craete a class employee with attribute empID , empName , Salary .
crate a method to accept the details input by user and runtime and another method to show/display the values of the attributes .
 create an employee array of size=3 and call these methods on each employe obj*/
import java.util.*;
Scanner scan = new Scanner(System.in);
    class Employee{
        int empID;
        String empName;
        Float Salary;

        public void acceptDetail(){
            System.out.println("Enter the Id of the employee");
            empID = scan.nextInt();

            System.out.println("Enter the name of employee ");
            empName = scan.nextLine();

            System.out.println("Enter the salary ");
            Salary = scan.nextFloat();
        }

        public void showDetail(){
            System.out.println("employee Id :"+empID);
            System.out.println("employee name :" + empName);
            System.out.println("employee Salary :"+ Salary);
        }
    }
public class test7{
    public static void main(String[] args) {
        Employee employee[] = new Employee[3];
        for(int i = 0 ;i<3;i++){
            
            employee[i].acceptDetail();
        }
        for(int i = 0 ;i<3;i++){
            employee[i].showDetail();
        }
    }
}
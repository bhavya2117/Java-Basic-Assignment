//Q21.Write a java program to maintain the list of Employees who works in the organization. Follow the below given design to develop the above program:
//Design a class Employee with EmpId, EmpName & EmpDesignation as private
//attributes. It contains a parameterized constructor to initialize all the data members of class. It also comprises the Getter methods for all the private fields.
//Design a main class comprising main method. The main class comprises an array of Employee object which needs to be initialized with the command line input.
//It displays the information of Employees from the array using loop.

package Ques21;

public class Employee {
    private int empId;
    private String empName, empDesignation;
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    Employee(int empId, String empName, String empDesignation) {
        this.empId = empId;
        this.empDesignation = empDesignation;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee [emp_id = " + empId + ", name = " + empName + ", Desgination = " + empDesignation +
                "]";
    }
}

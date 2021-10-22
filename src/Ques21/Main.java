package Ques21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EmpID");
        int empId = sc.nextInt();
        System.out.println("Enter Name");
        String empName = sc.next();
        System.out.println("Enter Designation");
        String empDesignation = sc.next();
        Employee obj = new Employee(empId, empName, empDesignation);
        System.out.println(obj);
    }
}

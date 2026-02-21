/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;
/**
 *
 * @author Anya
 */
import static com.mycompany.motorph.Employee.motorPhCsv;
import java.util.List;

public class MotorPH {

    public static void main(String[] args) {
        //Arraylist to store the Employees objects
        String path = "C:\\Users\\Anya\\Downloads\\Copy of MotorPH_Employee Data - Employee Details.csv";

        List<Employee> employees = motorPhCsv(path);
       
        for (Employee employee : employees) {
            System.out.println("Employee #: " + employee.employeeId);
            System.out.println("Employee Name: " + employee.lastName + ", " +employee.firstName);
            System.out.println("BirthDate: " + employee.birthDate);
            System.out.println("");
        }
        
       
        
    }
    
}
 
            
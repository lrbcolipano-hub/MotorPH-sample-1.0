/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;
/**
 *
 * @author Anya
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MotorPH {

    public static void main(String[] args) {
        //Arraylist to store the Employees objects
        List<Employee> employees = new ArrayList<>();
        
        //Add employees on the array with their respective parameters
        employees.add(new Employee("Garcia, Manuel III",LocalDate.of(1983, 10, 11),10001));
        employees.add(new Employee("Lim, Antonio",LocalDate.of(1988, 6, 19),10002));
        employees.add(new Employee("Aquino, Bianca Sofia", LocalDate.of(1989, 8, 4),10003));
        employees.add(new Employee("Reyes, Isabella", LocalDate.of(1994, 6, 16),10004));
        employees.add(new Employee("Hernandez, Eduard", LocalDate.of(1989, 9, 23),10004));
        
        
        //for loop to iterate through each objects for details printing 
        for (Employee employee : employees) {
            System.out.println("Employee #: " + employee.id);
            System.out.println("Employee Name: "+ employee.displayName());
            System.out.println("Birthday: " + employee.displayBirthDate());
            System.out.println(" ");
        }
    }
    
}
 
            
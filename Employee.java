package com.mycompany.motorph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    //attributes of each employees (employee name, birthdate and id
    String employeeId;
    String lastName;
    String firstName;
    String birthDate;
    
    //constructor for the Employee class
    public Employee (String employeeId, String lastName, String firstName, String birthDate){
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate  = birthDate;  
    }
    public static List<Employee> motorPhCsv(String path){
        List<Employee> employees = new ArrayList<> ();
        String line;
        
        try {
            //use BufferedReader class to read the MotorPH CSV file
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            //while loop to run to the file infinitely as long as the CSV file is  read
            while ((line = br.readLine()) !=null) {
                //split by comma
                String[] values = line.split(",");
                
                //Assign values to the attributes of each Object
                Employee employee = new Employee(values[0],values[1],values[2],values[3]);
                employees.add(employee);
            }
            
            
        } catch (FileNotFoundException ex) {
            System.getLogger(MotorPhData.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }catch (IOException ex) {
            System.getLogger(MotorPhData.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
        return employees;
}
}


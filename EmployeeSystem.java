/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeesystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anya
 */
public class EmployeeSystem {
    
    String id;
    String lastName;
    String firstName;
    String birthDate;
    int basicSalary;
    int riceSubsidy;
    int phoneAllowance;
    int clothingAllowance;
    double grossSemiMontlyRate;
    double hourlyRate;
    
    
    
    public EmployeeSystem(String id, String lastName,String firstName,String birthDate, 
        int basicSalary, int riceSubsidy,int phoneAllowance,int clothingAllowance, double grossSemiMontlyRate,double hourlyRate ){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMontlyRate = grossSemiMontlyRate;
        this.hourlyRate = hourlyRate;
    }
        public static List<EmployeeSystem> getMotorCsv (String path) {
            List<EmployeeSystem> employees = new ArrayList();
            String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
                while((line = br.readLine()) != null) {
                        String[] attributes = line.split(",");
                        String id = attributes[0];
                        String lastName = attributes[1];
                        String firstName = attributes[2];
                        String birthDate = attributes[3];
                        int basicSalary = Integer.parseInt(attributes[4]);
                        int riceSubsidy = Integer.parseInt(attributes[5]);
                        int phoneAllowance = Integer.parseInt(attributes[6]);
                        int clothingAllowance = Integer.parseInt(attributes[7]);
                        double grossSemiMontlyRate = Double.parseDouble(attributes[8]);
                        double hourlyRate = Double.parseDouble(attributes[9]);
                        
                        employees.add(new EmployeeSystem(id, lastName, firstName,
                                    birthDate, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossSemiMontlyRate, hourlyRate));
                            
                        /*EmployeeSystem employee = new EmployeeSystem(id, lastName, firstName,
                        birthDate, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossSemiMontlyRate, hourlyRate);
                            employees.add(new EmployeeSystem(id, lastName, firstName,
                                    birthDate, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossSemiMontlyRate, hourlyRate));
                        employees.add(employee);*/
                        
                            
                    }   
                 
                
                
        } 
  
        catch (FileNotFoundException ex) {
            System.getLogger(EmployeeSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        catch (IOException ex) {
                    System.getLogger(EmployeeSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
        
           return employees;
        }
    
   

    public static void main(String[] args) {
        String payroll = "payroll_officer";
        String password = "12345";
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("UserName: ");
        String inputUser = scanner.nextLine().toLowerCase();
        
        System.out.print("Password:  ");
        String inputPass = scanner.nextLine();

        //Declare variable
        //Arraylist to store the Employees objects
        
        String path = "C:\\Users\\Anya\\Downloads\\Untitled spreadsheet - Sheet1 (2).csv";
        List<EmployeeSystem> employees = getMotorCsv (path);
        for(EmployeeSystem employee: employees) {
            boolean userNameVerified = (inputUser.equals((employees.get(0).lastName+"."+employees.get(0).firstName).toLowerCase().replace(" ","")) || (inputUser.equals(payroll.toLowerCase())));
            boolean passVerified = inputPass.equals(password);
            if (!(userNameVerified && passVerified)) {
                System.out.println("Incorrect User Name and/or Password");
                System.exit(0);
            }
        }
        
        for (EmployeeSystem employee : employees) {
            System.out.println("Employee #: " + employee.id);
            System.out.println("Employee Name: " + employee.lastName + ", " +employee.firstName);
            System.out.println("BirthDate: " + employee.birthDate);
            System.out.println("");
            System.out.println("");
            System.out.println("Basic Salary: " + employee.basicSalary);
            System.out.println("Rice Subsidy: " + employee.riceSubsidy);
            System.out.println("Phone Allowance: " + employee.phoneAllowance);
            System.out.println("Gross Semi-Monthly Rate: " + employee.grossSemiMontlyRate);
            System.out.println("Hourly Rate: " + employee.hourlyRate);

        }
        scanner.close();
    }
}

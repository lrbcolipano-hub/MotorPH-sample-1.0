/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moterph;

import java.util.Scanner;

/**
 *
 * @author Rachelda Honrado
 */
public class Moterph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //===================== LOGIN SYSTEM ======================================
        String CorrectUsername = "admin";
        String correctPassword = "1234";
        boolean loggedIn = false;
        
        for (int attempt = 1; attempt <= 3; attempt++){ 
            System.out.println("==========MOTORPH LOGIN========");
            System.out.println("Username: ");
            String username = input.nextLine();
            
            System.out.print("Password: ");
            String password = input.nextLine();
           
            if (password.equals(correctPassword)&& username.equals(CorrectUsername)){
                loggedIn = true;
                System.out.println("\nLogin Successfull!\n");
                break;
            }else{
                System.out.println("Invalid credentials.Attempt"+ attempt + "of3.\n");
            }
        }
        if (!loggedIn){
            System.out.println("Too many failed attempts.System locked.");
            return;
        }
        
        
        //====================== EMPLOYEE DATABASE ==========================
        String[][] employees = {
            {"10001","Garcia, Manuel III", "1983-Oct-11","90000","1500","2000","1000"},
            {"10002","Lim, Antonio","1988-Jun-19","60000","1500","2000","1000"},
            {"10003","Aquino,Bianca Sofia","1989-Aug-04","60000","1500","2000","1000"},
            {"10004","Reyes, Isabella","1994-Jun-16","52670","1500","1000","1000"},
            {"10005", "Hernadez, Eduard","1989-Sep-23","52670","1500","1000","1000"},
        };
        //======================= SEARCH LOOP ==================================
        while (true){
            System.out.print("Enter Employee Number (or type `exit`):");
            String empSearch = input.nextLine();
            
            if (empSearch.equalsIgnoreCase("Exit")){
                System.out.println("System Closed.");
                break;
            }
            
            boolean found = false;
            for (String[] employee : employees) {
                if (employee[0].equals(empSearch)) {
                    found = true;
                    String empNumber = employee[0];
                    String empName = employee[1];
                    String birthday = employee[2];
                    double basicSalary = Double.parseDouble(employees[1][3]);
                    double rice = Double.parseDouble(employee[4]);
                    double phone = Double.parseDouble(employee[5]);
                    double clothing = Double.parseDouble(employee[6]);
                    double grossSalary = basicSalary + rice + phone + clothing;
                    double sss = computeSSS(grossSalary);
                    double philhealth = (basicSalary*0.03)/2;
                    double pagibig = 100.00;
                    double totalDeductions = sss + philhealth + pagibig;
                    double taxableIncome = grossSalary - totalDeductions;
                    double withholdingTax = computeTax(taxableIncome);
                    double netSalary = grossSalary - totalDeductions - withholdingTax;
                    //==================OUTPUT=================
                    System.out.println("/n===========EMPLOYEE PAYROLL==========");
                    System.out.println("Employee#:" + empNumber);
                    System.out.println("Employee Name:" + empName);
                    System.out.println("Birthday:" + birthday);
                    System.out.println("-------------------------------------------");
                    System.out.println("Gross Salary:" + grossSalary);
                    System.out.println("SSS Deduction:" + sss);
                    System.out.println("PhilHealth:" + philhealth);
                    System.out.println("Pag-IBIG:" + pagibig);
                    System.out.println("Withholding Tax:" + withholdingTax);
                    System.out.println("Net Salary   :" + netSalary);
                    System.out.println("=========================================\n");
                }
            }
    if (!found){
     System.out.print("Employee not found.\n");
}
}
input.close();

}
    //===================== SSS COMPUTATION ============================
    public static double computeSSS (double salary){
        
        if (salary < 3250)
            return 135.00;
        else if (salary < 24750)
            return 900.00;
        else
            return 1125.00;
    }
    //=================== TAX COMPUTATION =============================== 
    public static double computeTax(double taxableIncome){
        
        if (taxableIncome <=20832 )
            return 0;
        
        else if (taxableIncome < 33333 )
            return 2500 + (taxableIncome - 20832 )*0.20;
        
        else if (taxableIncome < 66667 )
            return 2500 + (taxableIncome - 33333 )*0.25;
        
        else if (taxableIncome < 166667)
            return 10833 + (taxableIncome - 66667 )*0.30;
        
        else if (taxableIncome < 666667)
            return 40833.33 + (taxableIncome - 166667 )*0.32;
        
        else
            return 200833.33 + (taxableIncome - 666667)*0.35;
        
        
            
            
            
    }
}

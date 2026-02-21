/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moterph;

/**
 *
 * @author Rachelda Honrado
 */
public class Moterph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] employees = {
            {"10001","Garcia, Manuel III", "1983-Oct-11","90000","1500","2000","1000"},
            {"10002","Lim, Antonio","1988-Jun-19","60000","1500","2000","1000"},
            {"10003","Aquino,Bianca Sofia","1989-Aug-04","60000","1500","2000","1000"},
            {"10004","Reyes, Isabella","1994-Jun-16","52670","1500","1000","1000"},
            {"10005", "Hernadez, Eduard","1989-Sep-23","52670","1500","1000","1000"},
        };
        
        for (String[] employee : employees) {
            String empNumber = employee[0];
            String empName = employee[1];
            String birthday = employee[2];
            double basicSalary = Double.parseDouble(employee[3]);
            double rice = Double.parseDouble(employees[1][4]);
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

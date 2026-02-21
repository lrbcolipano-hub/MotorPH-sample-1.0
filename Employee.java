/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Anya
 */
public class Employee {
    //attributes of each employees (employee name, birthdate and id
    String name;
    LocalDate birthDate;
    int id;
     
    //constructor for the attributes of name, birthdate and id
    Employee(String name, LocalDate birthDate, int id) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }

    //lets set a displayDetails method for easy printing of each attributes
    public String displayDetails (){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");//add DateTimeFormatter class to display the birth date in a more readable format
        String formattedDate = birthDate.format(formatter);
        return "MotorPH employee: " + name + " " + "Employee ID: " + id + " " +  "Birthdate: " + formattedDate;
    }
}

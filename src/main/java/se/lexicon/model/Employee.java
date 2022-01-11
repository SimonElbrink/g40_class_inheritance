package se.lexicon.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Employee extends Person {

   private double salary;
   private LocalDate hiredDate;
   private Role[] roles;


    public Employee(String firstName, String lastName, LocalDate birthDate, double salary, LocalDate hiredDate, Role ...roles) {
        super(firstName, lastName, birthDate);
        this.salary = salary;
        this.hiredDate = hiredDate;
        this.roles = roles;
    }

    @Override
    public String getDescription(){
        return "Employee with Name " + getFullName() + " has a salary of " + getSalary() + " and was hired " + getHiredDate();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hiredDate=" + hiredDate +
                ", roles=" + Arrays.toString(roles) +
                "} " + super.toString();
    }
}

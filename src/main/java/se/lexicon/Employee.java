package se.lexicon;

import java.time.LocalDate;

public class Employee extends Person {

   private double salary;
   private LocalDate hiredDate;


    public Employee(String firstName, String lastName, LocalDate birthDate, double salary, LocalDate hiredDate) {
        super(firstName, lastName, birthDate);
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    @Override
    public String getDescription(){
        return "Employee with Name " + getFirstName() + " has a salary of " + getSalary() + " and was hired " + getHiredDate();
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
                "} " + super.toString();
    }
}

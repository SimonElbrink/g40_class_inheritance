package se.lexicon.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Employee extends Person {

    private static final double BASE_SALARY = 25_000;

   private double salary;
   private LocalDate hiredDate;
   private Role[] roles;


    public Employee(String firstName, String lastName, LocalDate birthDate, LocalDate hiredDate, Role ...roles) {
        super(firstName, lastName, birthDate);
        this.hiredDate = hiredDate;
        this.roles = roles;
        calculateSalary();
    }

    private void calculateSalary(){
        double newSalary = BASE_SALARY;
        for (int i = 0; i < roles.length; i++) {
            newSalary += roles[i].getBonus();
        }
        this.salary = newSalary;
    }

    public void raiseSalary(int percentage){
        double raise = salary * percentage / 100;
        this.salary += raise;

    }

    @Override
    public String getDescription(){
        return "Employee with Name " + getFullName() + " has a salary of " + getSalary() + " and was hired " + getHiredDate();
    }

    public double getSalary() {
        return salary;
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

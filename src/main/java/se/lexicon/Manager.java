package se.lexicon;

import java.time.LocalDate;

public class Manager extends Employee{

    double bonus;

    public Manager(String firstName, String lastName, LocalDate birthDate, double salary, LocalDate hiredDate, double bonus) {
        super(firstName, lastName, birthDate, salary, hiredDate);
        this.bonus = bonus;
    }

    @Override
    public String getDescription(){
        return "Employee with Name " + getFullName() + " has a salary of " + getSalary() + " has a bonus of " + getBonus() + " and was hired " + getHiredDate();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}

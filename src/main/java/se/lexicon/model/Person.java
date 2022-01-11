package se.lexicon.model;

import java.time.LocalDate;

// Extending Object is not actually needed.
public abstract class Person extends Object {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public abstract String getDescription();

    //Constructor criteria need to be matched in order to instantiate object
    public Person(String firstName, String lastName, LocalDate birthDate) {
        super(); // This is calling the constructor of the parent. (Object)
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

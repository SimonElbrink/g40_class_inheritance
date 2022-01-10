package se.lexicon;

import java.time.LocalDate;

public class Student extends Person{

    private String[] courses;

    public Student(String firstName, String lastName, LocalDate birthDate){
        super(firstName, lastName, birthDate);
        this.courses = new String[0];
    }

    public String[] getCourses() {
        return courses;
    }

    public boolean addCourse(String courseName){
        //Logic for adding a course to the array.
        return false;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String getDescription() {
        return toString();
    }
}

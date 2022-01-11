package se.lexicon;

import se.lexicon.model.Employee;
import se.lexicon.model.Role;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       Employee staff1 = new Employee("Simon", "Elbrink",LocalDate.of(1960,3,18), LocalDate.parse("2020-01-05"), Role.DEVELOPER);
       staff1.setFirstName("Simon");
       staff1.setHiredDate(LocalDate.of(2019,3,18));

        System.out.println(staff1.getFullName());
        System.out.println("staff1.getSalary() = " + staff1.getSalary());
        System.out.println(staff1);


       Employee boss1 = new Employee("Marcus", "Gudmundsen", LocalDate.MIN, LocalDate.parse("2020-01-01"), Role.MANAGER, Role.HUMAN_RESOURCE);
        System.out.println(boss1);

        Employee[] employeeStorage = new Employee[10];

        employeeStorage[0] = staff1;
        employeeStorage[1] = boss1;

        int[] numbers = {2,9,3,5,8,2,211,5,8,4,3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        //SET, LIST, MAP
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Kent", "Gudmundsen", LocalDate.MAX, LocalDate.parse("2016-06-01"),Role.CEO, Role.HUMAN_RESOURCE, Role.MANAGER));
        employees.add(boss1);
        employees.add(staff1);

        employees.forEach(System.out::println);
    }

    enum Month{}

    class Car{}

    interface Swim{}




}

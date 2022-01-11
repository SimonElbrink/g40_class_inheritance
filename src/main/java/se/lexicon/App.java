package se.lexicon;

import se.lexicon.model.Employee;
import se.lexicon.model.Person;
import se.lexicon.model.Role;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       Employee staff1 = new Employee("Simon", "Elbrink",LocalDate.of(1960,3,18), 10000, LocalDate.now(), Role.DEVELOPER);
       staff1.setFirstName("Simon");
       staff1.setSalary(60000);
       staff1.setHiredDate(LocalDate.of(1997,3,18));


        System.out.println(staff1.getFullName());
        System.out.println("staff1.getSalary() = " + staff1.getSalary());
        System.out.println(staff1.getDescription());
        System.out.println(staff1.toString());
        System.out.println(staff1);



       Employee boss1 = new Employee("Marcus", "Gudmundsen", LocalDate.MIN, 10000, LocalDate.now(), Role.CEO, Role.MANAGER, Role.HUMAN_RESOURCE);
        System.out.println(boss1.getDescription());
        System.out.println(boss1.toString());
        System.out.println(boss1);

        //Saving a manager in an Employee reference.
        Employee bossAsEmployee;
        bossAsEmployee = boss1;
        System.out.println(bossAsEmployee.getDescription());

//        //Casting
//        Manager castedBoss = (Manager) bossAsEmployee;
//        System.out.println(castedBoss.getBonus());



//        Person dev = new Developer("","",null,0,null, null);

        Person[] personStorage = new Person[10];

        personStorage[0] = staff1;
        personStorage[1] = boss1;
//        personStorage[2] = dev;


        Role[] values = Role.values();

        for (Role role :
                values) {
            System.out.println(role.toString());
        }


    }

    enum Month{}

    class Car{}

    interface Swim{}




}

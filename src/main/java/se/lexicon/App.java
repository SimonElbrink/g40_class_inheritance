package se.lexicon;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       Employee staff1 = new Employee("Simon", "Elbrink",LocalDate.of(1960,3,18), 10000, LocalDate.now());
       staff1.setFirstName("Simon");
       staff1.setSalary(60000);
       staff1.setHiredDate(LocalDate.of(1997,3,18));


        System.out.println(staff1.getFullName());
        System.out.println("staff1.getSalary() = " + staff1.getSalary());
        System.out.println(staff1.getDescription());
        System.out.println(staff1.toString());
        System.out.println(staff1);



       Manager boss1 = new Manager("Marcus", "Gudmundsen", LocalDate.MIN, 10000, LocalDate.now(), 10000);
        System.out.println(boss1.getDescription());
        System.out.println(boss1.toString());
        System.out.println(boss1);

        //Saving a manager in an Employee reference.
        Employee bossAsEmployee;
        bossAsEmployee = boss1;
        System.out.println(bossAsEmployee.getDescription());

        //Casting
        Manager castedBoss = (Manager) bossAsEmployee;
        System.out.println(castedBoss.getBonus());



        Person dev = new Developer("","",null,0,null, null);

        Person[] personStorage = new Person[10];

        personStorage[0] = staff1;
        personStorage[1] = boss1;
        personStorage[2] = dev;


    }

    public void finalExample(){

        final String fixedValue;

        fixedValue = "Hello";
//        fixedValue = "HelloWorld";

        final int fixedInt = 10;
//        fixedInt = 100;

        Integer x = 100;


        final int[] fixedSizeArray = new int[3];
//        fixedSizeArray = new int[5];
        fixedSizeArray[0] = x;
        fixedSizeArray[1] = 600;
        fixedSizeArray[2] = 2000;

        fixedSizeArray[1] = 300;

        fixedSizeArray[0] = 1000;




//        Person newPerson = new Person();





    }
}

package se.lexicon;

public class FinalExample {
    public static void main(String[] args) {

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


        // Can't because Person is an Abstract class.
//        Person newPerson = new Person();
    }
}

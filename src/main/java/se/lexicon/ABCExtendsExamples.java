package se.lexicon;

public class ABCExtendsExamples {
    public static void main(String[] args) {

        A objectA = new A();
        objectA.message(); // Message from A

        B objectB = new B();
        objectB.message(); // Message from B
        objectB.foo();

        C objectC = new C();
        objectC.message(); // Message from B, B is the closes' implementation of message method.

        A objectCAsA = new C(); // "Downgrade" to A  - Referenced as an A class actual Object is an C class.
        objectCAsA.message(); // Message from B, B is the closes' implementation of message method.

        objectCAsA.message(); // Message from B, B is the closes' implementation - It's actually an C Object.
        //objectCAsA.foo();
        objectC.message();

        D objectD = new D();
        objectD.message();

    }
}

// Super|Parent Class To B & C
class A{
    String aMessage = "Hello ";
    public void message(){
        System.out.println("Message from A: " + aMessage);
    }
}

// Super|Parent Class To C
// Sub|Child|Derived Class of A
class B extends A {

    String bMessage = "World";

    @Override
    public void message() {
        System.out.println("Message from B: " + foo());
    }

    //Additional Method
    public String foo(){
//        return super.aMessage + this.bMassage; // //Also work. this is more specifically targeted.
        return aMessage + bMessage;
    }
}

// Sub|Child|Derived Class of B & A
//class C extends A,B{ } // Can't Extend more the one class.
class C extends B{

}

class D extends C {

    @Override
    public void message() {
        System.out.println("Message from D: " + foo());
//        System.out.println("Message from D: " + super.foo()); // foo in super class. (B)
    }

    @Override
    public String foo() {
//        return aMessage + bMessage; // Hello World

        String bMessage = "G#";
        return aMessage + bMessage; // Hello G#

//        return aMessage + super.bMessage; // Hello World
    }
}
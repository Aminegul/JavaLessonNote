package day14constructors_oop;

 // CHILD CLASS (SUB CLASS) - INHERITANCE
public class C04Dog extends C03Animal {

     public C04Dog(int age, String name) {
         super(age, name);
     }

     public void bark(){
        System.out.println("Dogs bark...");
    }



     // METHOD
}

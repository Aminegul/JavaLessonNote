package day14constructors_oop;

public class C05Cat extends C03Animal {

    public String color ;

    public void meow(){
        System.out.println("Cats meow...");
    }  //METHOD

    // constructor
    public C05Cat(int age, String name , String color) {
        super(age, name);
        this.color=color;


    }
}

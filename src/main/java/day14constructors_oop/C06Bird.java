package day14constructors_oop;

public class C06Bird extends C03Animal {

    public void tweet(){
        System.out.println("Birds tweet...");
    }

    public C06Bird(int age, String name) {
        super(age, name);
    }
}

package day14constructors_oop;

public class C07AnimalRunner {

    public static void main(String[] args) {

        C04Dog myDog = new C04Dog(1,"bulut");
        myDog.eat();
        myDog.drink();
        myDog.bark();
        System.out.println(myDog.age);//0
        System.out.println(myDog.name);//null

        C05Cat myCat = new C05Cat(2, "piril", "white");
        myCat.eat();
        myCat.drink();
        myCat.meow();

    }

}

package day14constructors_oop;

public class C02StudentRunner {

    public static void main(String[] args) {

        C01Students std1 = new C01Students(); // STUDENT CLASS'IN OBJESİ ---- NO PARAMETERS KULLANDIĞIMIZ İÇİN CALSSTAKİ VARİABLE I ALDI.
        System.out.println(std1.stdAge);

        C01Students std2 = new C01Students("Brad Pitt", 57, "BD1967002"); // PARAMETRE VERDİĞİMİZ İÇİN BURADAKİ DEĞERLERİ ALDI VERMESEYDİK CALSSTAKİLERİ ALACAKTI.
        System.out.println(std2.stdName);
        System.out.println(std2.stdAge);
        std2.study();
        std2.doSport();

        C01Students amy = new C01Students("Amine" , 26, "43297" );

        System.out.println(amy.stdName + " is " + amy.stdAge + " years old. ");

    }

}

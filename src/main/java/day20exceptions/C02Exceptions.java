package day20exceptions;


import java.io.FileInputStream;
import java.io.IOException;


/*
    1)"throw" is used inside the method body, "throws" is used in the same line with the method name
    2)"throw" can be used multiple times in a method body, but "throws" can be used just once in a method
    3)"throw" is for throwing exceptions for some specific conditions.
      "throws" is for throwing exceptions, it is used for Compile Time Exceptions mostly...
    4)"throw" uses Exception Object, "throws" uses Exception Class Name
    5)After "throw" you can use just a single Exception Object, after "throws" you can use many Exception Class Names.
 */
public class C02Exceptions {

    public static void main(String[] args) {

        //örnek1
        int a = mutiply(3);
        System.out.println(a);
        //örnek2
        String b= reverseOfAString("Ankara");
        System.out.println(b);

        printAge(23);
        printAge(-23);

    }



    //örnek1
    public static int mutiply(int number){

        return number*2;
    }
    //örnek2
    //Create a method to find reverse of a string
    //1. bu metodun return type ı ne olacak
    //2. parametre gerekiyor mu
    public static String reverseOfAString(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
           reverse = reverse + str.charAt(i);

            System.out.println(reverse);
        }

        return reverse;
    }




    //Create a method prints the user's age
    public static void printAge(int age){

        if(age>=0) {
            System.out.println(age);
        }else{
            throw new IllegalArgumentException("Age cannot be negative...");
        }
    }

    //Create a method to read text in a text file.
    public static void findAndReadTheFile() throws IOException {

        //To access the file
        FileInputStream fis = new FileInputStream("src/main/java/day22exceptions/MyFile.txt");

        //To read the file
        int k = 0;
        while((k=fis.read()) != -1){
            System.out.print((char)k);
        }
    }

}

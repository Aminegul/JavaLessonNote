package day03_scanner_concatenation;

import java.util.Scanner;

public class ex1 {



    public static void main(String[] args) {

        int age = 12;
        char initial = 'j';

        System.out.println(age + initial);


        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your name");

        String day =scan.next();

        char ch1 = day.charAt(1);
        char ch2 = day.charAt(3);

        System.out.println(""+ch1+ch2);


    }

}

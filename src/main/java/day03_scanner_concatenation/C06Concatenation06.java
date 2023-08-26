package day03_scanner_concatenation;

public class C06Concatenation06 {

    public static void main(String[] args) {

        //Concatenation is an operation to join Strings with Strings or to join String with other data types
        // Symbol of concatenation is "+"

        System.out.println("Tom" + "Hanks"); //TomHanks
        System.out.println("Tom" + " Hanks");
        System.out.println("Tom " + "Hanks");
        System.out.println("Tom" + " " + "Hanks");

        // Tom 32 Because first come String for this doesn't take + as addition, take it as concatenation
        System.out.println("Tom " + 3 + 2); // Tom 32
        System.out.println("Tom " + (3 + 2)); // Tom 5

        //Multiplication is done before addition that is why the result is Tom 6
        System.out.println("Tom " + 3*2); //Tom 6
        System.out.println("Tom " + (3*2)); //Tom 6

        System.out.println(3 + 2 + "Tom"); // 5Tom

        System.out.println(3*2 + 4 + "Tom" + 5 + 6); // 6 + 4 "Tom" + 5 + 6 ===> 10 + "Tom" + 5+ 6 ===> "10Tom" + 5 + 6 ===> "10Tom5" + 6 ===> "10Tom56"

        System.out.println(3*2 + 4 + "Tom" + (5 + 6)); // "10Tom11""




    }
}


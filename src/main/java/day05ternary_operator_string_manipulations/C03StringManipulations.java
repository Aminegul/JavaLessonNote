package day05ternary_operator_string_manipulations;

public class C03StringManipulations {

    public static void main(String[] args) {

        //Example 1: Count the alphabetical characters in a given String
        //Tom12 Hanks!... ==> 8

        //i)Remove non-alphabetical characters ii)Count the remaining characters

        //non-alphabetical characters are a group of data.
        //To work with a group of data we use "Regular Expressions"(Regex)
        /*
            i)Uppercase letters: [A-Z]
            ii)Lower case letters: [a-z]
            iii)All letters: [A-Za-z]
            iv)All digits: [0-9]
            v)Letters from m to v: [m-v]
            vi)Regex for a, b, e, d, g, z: [abedgz]

            a)All characters different from uppercase letters: [^A-Z]
            b)All characters different from lowercase letters: [^a-z]
            c)All characters different from all letters: [^A-Za-z]
            d)All characters different from digits: [^0-9]
            e)All symbols(Different from letters and digits):[^A-Za-z0-9]

            f)All punctuation marks:\p{Punct}    //noktalama işaretleri
         */

        String s1 = "Tom12 Hanks!...";

       int numOfChar = s1.replaceAll("[^A-Za-z]", "").length();

        System.out.println(numOfChar);

        //replaceAll() ==> It changes a group of character to another characters
        // lenght() ==> Counts the number of characters in String

        //Example 2: Type code to change all digitsi to "*" in a given password
        //          pwd:a12b32c! ===> a**b**c!

        String pwd = "a12b32c!";

        String hiddenPwd= pwd.replaceAll("[0-9]", "*");

        System.out.println(hiddenPwd);



        //Example 3: Get the initials from full name. (Middle name is out of scope)
//           Tom Hanks ==> TH   -  tom hanks ==> TH  -  "   tOM Hanks   " ==> TH

        String name = "   tOm Hanks   ";

        System.out.println(name);

        String newName = name.trim();

        System.out.println(newName);

        String newName1 = name.trim().substring(0, 1);

        System.out.println(newName1);

        String newName2 = name.trim().substring(3, 7).toUpperCase();

        System.out.println(newName2);







    }
}

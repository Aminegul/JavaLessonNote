package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C05IfStatement03 {

    public static void main(String[] args) {

        //Example 4: Type code to decide a day name is week day name or weekend day name
        //           Monday ==> Week Day       Saturday ==> Weekend Day
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName = input.next();

        //equalsIgnoreCase metodu, karşılaştırılan metni öncelikle küçük harflere çevirir ve ardından karşılaştırma yapar.
        // Böylelikle büyük-küçük harf durumundan doğacak sorunun önüne geçilmiş olur.

        if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend Day");
        }else if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday")){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid day name...");
        }

    }
}

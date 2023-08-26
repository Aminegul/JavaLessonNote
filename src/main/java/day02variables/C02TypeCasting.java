package day02variables;

public class C02TypeCasting {

    public static void main(String[] args) {

        // Type Casting: If you assign a value of a primitive data type to another primitive data type,
        // it is called typecasting.

        // To put small data type into large data type is easy and Java will do it automatically.
        // The name of this process is "Auto Widening"
        byte myAge = 34;
        int age = myAge;

        System.out.println(age);

        // To put large data type into small data type has risk that is why Java does not it automatically.
        // You have to type small data type in front of the name of the large data explicitly
        // The name of this process is "Explicit Narrowing"
        long value1 = 3400;
        short value2 = (short)value1;

        System.out.println(value2);

        //Note:
        int numOfStd = 12;
        int amountOfMoney = 500;

        // If all values are int in a mathematical operation, the result will be int as well.
        // If the result is decimal in math, Java coverts it to int by removing decimal part of the result.
        System.out.println(amountOfMoney / numOfStd); // 41.666.... the result must be int.

        float num2= 12.5F;
        int num3= (int)num2;
        System.out.println(num3);

    }

}

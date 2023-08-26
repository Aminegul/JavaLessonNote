package day02variables;

public class C01Variables {

    public static void main(String[] args) {

        byte stdAge = 25; // data parts
        System.out.println(stdAge); //code part

        short numOfStdInHighSchool = 3245;
        System.out.println(numOfStdInHighSchool);

        int populationOfMiami = 1200000;
        System.out.println(populationOfMiami);

        // If you create "long" variable, use "L" at the end of the value when the value is out of "int range"
        long populationOfWorld = 7000000000L;
        System.out.println(populationOfWorld);

        long populationOfChina = 1500000000;
        System.out.println(populationOfChina);

        float shirtPrice = 23.99f; //F or f
        System.out.println(shirtPrice);

        double weightOfACell = 0.000000012; // 1.2E-8 = 1.2 X 10 (-8) on üzeri eksi sekiz
        System.out.println(weightOfACell);

        boolean isRetired = false;
        System.out.println(isRetired);

        char initial = 'A';
        System.out.println(initial);

        String stdName = "Mark Twain"; // !!!!!(S)!!!!! string
        System.out.println(stdName);

    }

}

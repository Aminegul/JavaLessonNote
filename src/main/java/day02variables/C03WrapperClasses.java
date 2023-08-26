package day02variables;

public class C03WrapperClasses {

    public static void main(String[] args) {

        //Wrapper Classes: Java created a new data structure by adding some useful methods to primitive data types.
        //          This new data structure is called "Wrapper Class"
        //Java created "Wrapper Class" for every primitive data type.

        /* Primitive      Wrapper Class
            byte     ====>  Byte
            short    ====> Short
            int      ====>  Integer
            long     ====> Long
            float    ====>  Float
            double   ====>  Double
            boolean  ====> Boolean
            char     ====> Character

         */
        /*

        public class Main {
    public static void main(String [] args)
    {
        int number = 46;
        String string_degisken = Integer.toString(number);
        System.out.println("Sayı int tipinde: "+ number);
        System.out.println("Sayı string  tipinde: "+ string_degisken);
    }
}

Sayı int tipinde: 46
Sayı string  tipinde: 46

        */



        // Following one is wrapper class it has many useful method.
        Integer age = 35;


        // Following one is primitive it does not have any method.
        int weight = 20;


        // If you use wrapper calss name you'll be able to use more methods.
        System.out.println(Integer.MIN_VALUE);  // -2147483648
        System.out.println(Integer.MAX_VALUE);  //  2147483647

        // Find the min and max value of short data types.
        System.out.println(Short.MIN_VALUE);   // -32768
        System.out.println(Short.MAX_VALUE);  //  32767

        //How to convert "primitive" to "wrapper"   ===> Autoboxing
        char ch = '?';
        Character chWrapper = ch; // Autoboxing

        // How to convert "wrapper" to "primitive"
        Boolean b1 = true;
        boolean b2 = b1; // Unboxing

    }

}

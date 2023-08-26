package org.example;

import java.util.Arrays;

public class Main_1 {

    public static void main(String[] args) {

        int[] numbers = {6,9,1};

        System.out.println(Arrays.toString(numbers));


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1,6,9]

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // 1,6,9
        }

        System.out.println();

        System.out.print(numbers[1]); //6 -- index i alındı

        System.out.println();

        for (int w: numbers) {

            System.out.print(w + " ");
        }

        System.out.println();
        System.out.print(Arrays.binarySearch(numbers, 9));

        System.out.println();

        String str = "What about Java, did you like it";

        String arr[] = str.split(" "); // boşuk yerine "," koyarsak virgülden parçalar

        System.out.println(arr[0]);

        System.out.print(Arrays.toString(arr));

        System.out.println();





    }

}

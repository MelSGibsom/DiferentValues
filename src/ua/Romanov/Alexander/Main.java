package ua.Romanov.Alexander;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 5, 6, 2, 6, 3, 3, 4, 1};
      //выведем массив на консоль
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+", ");
                   }
        System.out.println();
        int count = countNumberWithoutDuplicate(array);
        System.out.println("Count numbers: " + count);
    }

    static int countNumberWithoutDuplicate(int[] array) {
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count == 0) {
                numbers++;
            }
        }
        return numbers;
    }
}

package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_13_SumOfArraysInList {

    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50, 70};
        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

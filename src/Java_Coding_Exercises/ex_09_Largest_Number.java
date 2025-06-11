package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_09_Largest_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scanner.nextInt();

        System.out.println("Enter number2:");
        int num2 = scanner.nextInt();

        System.out.println("Enter number3:");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("largest is:" + num1);
        }
        if (num2 > num3) {
            System.out.println("largest is:" + num2);
        } else {
            System.out.println("Largest is:" + num3);
        }

    }
}

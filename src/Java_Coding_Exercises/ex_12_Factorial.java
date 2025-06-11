package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_12_Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println("Enter Number2:");
        int num2 = scanner.nextInt();

        int fact2 = 1;

        for (int j = 1; j <= num2; j++) {
            fact2 = fact2 * j;
        }
        System.out.println(fact2);
    }

}

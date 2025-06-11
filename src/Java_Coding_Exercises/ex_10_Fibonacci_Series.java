package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_10_Fibonacci_Series {
    //0 1 1 2 3  5 8 13 21

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter how many series:");
        int count = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for (int i = 2; i < count; i++) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2=sum;
        }

    }


}

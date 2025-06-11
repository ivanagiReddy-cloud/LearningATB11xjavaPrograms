package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_06_NoofDigits_inNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();

        int count = 0;
        //12345
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}

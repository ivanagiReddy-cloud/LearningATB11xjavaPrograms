package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_07_Noof_Even_Odd_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int even_Count = 0;
        int odd_Count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                even_Count++;
            } else {
                odd_Count++;
            }
            num = num / 10;
        }
        System.out.println(even_Count);
        System.out.println(odd_Count);
    }
}

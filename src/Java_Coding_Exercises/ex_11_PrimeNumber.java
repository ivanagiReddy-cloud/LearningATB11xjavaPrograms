package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_11_PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count==2){
                System.out.println("Number is Prime");
            }else
                System.out.println("Not prime");
        }else {
            System.out.println("Not prime");
        }
    }
}

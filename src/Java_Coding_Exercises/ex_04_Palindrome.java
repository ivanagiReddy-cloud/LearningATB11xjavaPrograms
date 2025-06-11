package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_04_Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int num = scanner.nextInt();

        int org_num = num;
        //1234
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);

        if (org_num == rev) {
            System.out.println("its a Palindrome number");
        } else {
            System.out.println("it's not palindrome number");
        }

    }
}

package Java_Coding_Exercises;

import java.util.Scanner;

public class Ex_02_Reverse_Number {

    public static void main(String[] args) {

        // 3 diffrent ways
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = scanner.nextInt();

//        int rev = 0;
//        while (number != 0) {
//
//            rev = rev * 10 + number % 10;  // 1234-> 4
//            number = number / 10;
//        }
//        System.out.println(rev);
        // Another way is String Buffer
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        StringBuffer rev1 = stringBuffer.reverse();
        System.out.println(rev1);

    }
}

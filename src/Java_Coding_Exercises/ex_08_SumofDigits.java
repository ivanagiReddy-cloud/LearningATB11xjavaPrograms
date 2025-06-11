package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_08_SumofDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();
        //1234
        int sum=0;
        while (num>0){
            sum = sum+ num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}

package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_03_Reverse_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text below:");
        String name = scanner.next();
        String rev = "";
        String rev1 = "";

        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

        //Character array
        String name1 = scanner.next();
        char a[] = name1.toCharArray();
        int len1 = a.length;
        for (int i = len1 - 1; i >= 0; i--) {
            rev1 = rev1 + a[i];
        }
        System.out.println(rev1);

        // StringBuffer
        String name2 = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(name2);
        StringBuffer rev2 = stringBuffer.reverse();
        System.out.println(rev2);
    }
}

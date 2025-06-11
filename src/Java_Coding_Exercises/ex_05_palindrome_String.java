package Java_Coding_Exercises;

import java.util.Scanner;

public class ex_05_palindrome_String {
    public static void main(String[] args) {

        //madam
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String name = scanner.next();
        String org_name = name;
        String rev="";
        int len = name.length();
        for (int i=len-1;i>=0;i--){
            rev =rev + name.charAt(i);
        }
        System.out.println(rev);

        if (org_name.equals(rev)){
            System.out.println("it's palindrome");
        }
        else {
            System.out.println("It's not palindrome");
        }

    }
}

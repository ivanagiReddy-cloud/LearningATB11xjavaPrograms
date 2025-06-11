package Java_Coding_Exercises;

public class Ex_01_SwapTwoNumbe {

    public static void main(String[] args) {
        int a = 20;
        int b = 40;

        //thrird variable
        int c = 0;
        c = a; //c=20
        a = b; //a=40
        b = c; //b=20
        System.out.println(a);
        System.out.println(b);

        //with out Third Variable
        a = a + b; //a=60
        b = a - b; //b=20
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        // * / operators

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(a);
        System.out.println(b);
    }
}

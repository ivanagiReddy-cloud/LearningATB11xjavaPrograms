package ex_02_Java_basic02;

public class Lab007_Printf {
    public static void main(String[] args) {
        byte b = 12;
        System.out.printf(" Enter variable value is %d", b);
        /* %d ->int, byte,short,long,-data type
          %s -> String
          %f -> float, double
          %b -> boolean*/
        byte a = 20;
        byte c =30;
        System.out.println("--------");
        System.out.printf("%d + %d", a, b);
        System.out.println("-----------");
        System.out.printf("%d * %d = %d", a,b,c);
    }
}

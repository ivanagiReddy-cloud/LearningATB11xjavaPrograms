package ex_03_Literals;

import java.lang.reflect.Array;

public class Lab013_Non_PremitiveDatatypes {
    public static void main(String[] args) {

        // Non Premitive Datatypes are objects and arrays,no fixed size, stores in heap area,
        // variables holds references to object
        String name = "Sive";
        int[] array = new int[10];
        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        array[3] = 20;
        array[4] = 30;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(name);

        Lab013_Non_PremitiveDatatypes objj = new Lab013_Non_PremitiveDatatypes();
        objj.newMethod();
    }

    void newMethod() {
        System.out.println("Non-Static Method");


    }
}


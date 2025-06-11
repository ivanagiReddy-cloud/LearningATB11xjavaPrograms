package Java_Coding_Exercises;

public class ex_14_Even_Odd_InArray {

    public static void main(String[] args) {

        int array[] = {1, 3, 9, 12, 23, 3, 8, 10};

        int even = 0;
        int odd = 0;
        int num = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            num = array[i];
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

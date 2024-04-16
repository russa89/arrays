import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадания 1, 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));
        // array 1

        double[] numbers1 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numbers1));
        //array 2

        int[] arr = {1, 2, 3, 7, 8};
        System.out.println(Arrays.toString(arr));
        //array 3
        System.out.println();

        System.out.println("Задание 3");
        for (int i = 0; i < numbers.length / 2; i++) {
            int a = numbers[0];
            numbers[0] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = a;
        }
        System.out.println(Arrays.toString(numbers));
        //array 1

        for (int i = 0; i < numbers1.length / 2 ; i++) {
            double b = numbers1[0];
            numbers1[0] = numbers1[numbers.length - i - 1];
            numbers1[numbers.length - i - 1] = b;
        }
        System.out.println(Arrays.toString(numbers1));
        //array 2

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
//        //array 3
        System.out.println();

        System.out.println("Задание 4");
            for (int i = 0; i < numbers.length; i++) {
            int a = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = a;
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}








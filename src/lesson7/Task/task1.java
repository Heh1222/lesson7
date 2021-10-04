package lesson7.Task;

/**
 * 1. Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */

public class task1 {

    public static void main(String[] args) {
        int[] x2 = {1,5,9,41,25,52};
        printArray(x2);
        printArrayForeach(x2);
        printArrayReverse(x2);

    }

    public static void printArrayReverse(int[] x2) {
        for (int i = x2.length - 1; i >= 0 ; i--) {
            System.out.print(x2[i] + " ");

        }
        System.out.println();
    }

    public static void printArray(int[] x2) {
        for (int i = 0; i < x2.length; i++) {
            System.out.print(x2[i] + " ");

        }
        System.out.println();

    }
    public static void printArrayForeach(int[] x2) {
        for (int x : x2) {
            System.out.print(x + " ");

        }
        System.out.println();
        }


}

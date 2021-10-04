package lesson7.Task;

/**
 * 2.Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */

    public class task2 {

    public static void main(String[] args) {
        int[] x2 = new int[100];
         fillArray(x2);
         task1.printArray(x2);

    }
    public static void fillArray(int[] x2) {
        int Index = 0;
        for (int z = 1; Index < x2.length ; z++) {
            if (z % 13== 0 || z % 17 ==0) {
                x2[Index] = z;
                Index++;
            }

        }
    }
}

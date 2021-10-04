package lesson7Array;

public class ArrayExam2 {

    public static void main(String[] args) {
        int[][] x2 = new int[3][];
        x2[0] = new int[2];
        x2[1] = new int[3];
        x2[2] = new int[5];
        Array(x2);


    }

    private static void test2() {
        int[] x = {1,2,3,4,5};
        int[][] x2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Array(x2);
    }

    private static void Array(int[][] x2) {
        for (int i = 0; i < x2.length; i++) {
            int[] z = x2[i];
            for (int j = 0; j < z.length; j++) {
                System.out.print(z[j] + " ");


            }
            System.out.println();
        }
    }
}

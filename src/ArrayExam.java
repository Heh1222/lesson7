public class ArrayExam {
    public static void main(String[] args) {
      int[] x2 = new int[10];
//        System.out.println(x2[5]);
        x2[4] = 89;
        x2[7] = 899;
        for (int i = 0; i < x2.length; i++) {
            System.out.println(i + ": " + x2[i]);

        }

    }

    private static void test() {
        int x = 10;
        int[] x2 = {3,4,7,12,45,43};
        System.out.println(x2[4]);
        x2[4] = 67;
        System.out.println(x2[4]);
    }
}

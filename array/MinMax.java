package array;

public class MinMax {

    public static void findMinMax() {
        int[] A = {5, 8, 3, 9, 6, 2, 10, 7, -1, 4, 70};
        int min = A[0];
        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            } else if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("MIN => " + min);
        System.out.println("MAX => " + max);
    }

    public static void main(String[] args) {
        findMinMax();
    }
}

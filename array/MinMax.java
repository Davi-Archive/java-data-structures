package array;

import java.util.Arrays;

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


    public static void reverse() {
        int rotate =3;
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int temp = 0;
        while (rotate > 0) {
            temp = a[0];
            for (int i = 0; i < a.length-1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;
            rotate--;
        }
        Arrays.stream(a).forEach(x -> System.out.printf(" %d", x));
    }

    public static void main(String[] args) {
        findMinMax();
        reverse();
    }
}

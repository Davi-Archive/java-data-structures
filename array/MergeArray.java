package array;

import java.util.Arrays;

public class MergeArray {

    private static int[] mergeArray() {
        int[] a = {1, 2, 3, 4, 7};
        int[] b = {5, 10, 11, 13, 15};
        int[] c = new int[a.length + b.length];

        int m = 0, n = 0, i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        for (; i < a.length; i++) {
            c[k++] = a[i];
        }
        for (; j < b.length; j++) {
            c[k++] = b[j];
        }

        return c;
    }


    private static int[] intersection() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {2, 3, 5, 6, 7, 9, 10};
        int arr3[] = new int[arr1.length + arr2.length];

        int newArrIndex = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[newArrIndex++]=arr1[i];
                }
            }
        }
        return arr3;
    }


    public static void main(String[] args) {
        Arrays.stream(mergeArray()).forEach(x -> System.out.printf(" " + x));
        System.out.println(" ");
        Arrays.stream(intersection()).forEach(x -> System.out.printf(" " + x));
    }
}
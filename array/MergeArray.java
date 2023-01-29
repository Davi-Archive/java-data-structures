package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                    arr3[newArrIndex++] = arr1[i];
                }
            }
        }
        return arr3;
    }

    public static int missingElement() {
        int arr[] = {10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22};
        boolean found = false;
        int res = 0;

        while (!found) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (!(arr[i] - i == arr[0])) {
                    found = true;
                    return res = arr[i] - 1;
                }
            }
        }
        return res;
    }

    public static List<Integer> manyMissingElement() {
        int arr[] = {10, 11, 12, 13, 14, 16, 17, 19, 20, 21, 22};
        boolean found = false;
        List<Integer> res = new ArrayList<>();
        int diff = arr[0];
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (diff != arr[i] - i) {
                while (diff < arr[i] - i) {
                    System.out.println(i + diff);
                    res.add(i + diff);
                    diff++;
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Arrays.stream(mergeArray()).forEach(x -> System.out.printf(" " + x));
        System.out.println(" ");
        System.out.println(missingElement());

        System.out.println(" ");
        manyMissingElement().forEach(x -> System.out.printf("Missing => %d %n", x));
    }
}

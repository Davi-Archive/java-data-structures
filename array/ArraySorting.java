package array;

import java.util.Arrays;

public class ArraySorting {

    private static int[] arr = {12, 13, 5, 34, 22, 35, 65, 32, 45, 56};

    private static int[] reverse() {
        int[] reversedArr = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reversedArr[i] = arr[j];
        }
        return reversedArr;
    }



    public static void main(String[] args) {
        System.out.printf("Inverted Array");
        Arrays.stream(reverse()).forEach(x -> System.out.printf(" " + x));


    }
}

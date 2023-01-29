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

    private static int[] reverseWithTemp() {
        int[] reversedArr = new int[arr.length];
        int temp;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            reversedArr[i] = arr[j];
            reversedArr[j] = temp;
        }
        return reversedArr;
    }

    public static char[] leftShift(int numberOfChanges) {
        char temp, temp2;
        char[] newArr = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int j = 0; j < numberOfChanges; j++) {
            temp = newArr[0];
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = newArr[i + 1];
            }

            newArr[newArr.length - 1] = temp;
        }
        return newArr;
    }

    public static int[] sortArray() {
        int[] array = {4, 5, 6, 8, 2, 3, 45, 34, 12, 56};
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static boolean isTheArraySorted(int[] array) {
        int[] array2 = {4, 5, 6, 8, 2, 3, 45, 34, 12, 56};
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.printf("Inverted Array");
        Arrays.stream(reverse()).forEach(x -> System.out.printf(" " + x));

        System.out.println(" ");
        System.out.printf("Reversed arr with temp var");
        Arrays.stream(reverseWithTemp()).forEach(x -> System.out.printf(" " + x));

        System.out.printf("%n Reversed char arr=>");
        for (char character : leftShift(2)) {
            System.out.printf(" " + character);
        }

        System.out.printf("%n Order array=>");
        Arrays.stream(sortArray()).forEach(x -> System.out.printf(" " + x));

        System.out.printf("%n ArraySorted?=>");
        Arrays.stream(new Boolean[]{isTheArraySorted(new int[]{1,7, 2, 3, 4, 5, 6})}).forEach(x -> System.out.printf(" " + x));

    }
}

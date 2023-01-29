package array;

import java.util.Arrays;

public class MissingElement {

    public static int[] findMissing() {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 11, 12};

        int missingArr[] = new int[220];
        int k = 0;
        boolean missing = true;

        while (missing) {
            missing = false;
            for (int i = 0; i < 8; i++) {
                if (arr[i] != (1 + arr[i + 1])) {
                    missingArr[k++] = arr[i] + 1;
                    arr[i] = arr[i] + 1;
                    missing = true;
                }
            }

        }
        return missingArr;
    }


    public static void main(String[] args) {
        System.out.println(" ");
        Arrays.stream(findMissing()).forEach(x -> System.out.printf(" " + x));
    }

}

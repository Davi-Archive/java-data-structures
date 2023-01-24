package array;

import java.util.ArrayList;

public class BinarySearch {

    static int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 34, 45, 55};

    static int binSearch(int lowIndex, int highIndex, int keyValue) {
        int mid;
        while (lowIndex <= highIndex) {
            mid = (lowIndex + highIndex) / 2;
            if (keyValue == Arr[mid]) return mid;
            else if (keyValue < Arr[mid]) {
                highIndex = mid - 1;
            } else {
                lowIndex = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = binSearch(0, Arr.length, 34);
        System.out.println("INDEX: " + res);

    }

}

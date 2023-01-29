package array;

public class SumOfArray {

    public static void sumEqualsK() {
        int[] arr = {6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
        int[] H = new int[27];
        int k = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 10 && H[k - arr[i]] != 0) {
                System.out.printf("%d + %d = %d %n", arr[i], k - arr[i], k);
            }
            H[arr[i]]++;
        }
    }

    public static void sumWhileLoop() {
        System.out.println("SUM WHILE LOOP:");
        int[] A = {1, 2, 4, 5, 6, 8, 9, 10, 12, 14};
        int i = 0;
        int j = A.length - 1;
        int k = 10;

        while (i < j) {
            if (A[i] + A[j] == k) {
                System.out.printf("%d + %d = %d %n", A[i], A[j], k);
                i++;
                j--;
            } else if ((A[i] + A[j]) < k) {
                i++;
            } else {
                j--;
            }
        }

    }


    public static void main(String[] args) {
        sumEqualsK();
        sumWhileLoop();
    }
}

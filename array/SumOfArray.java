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


    public static void main(String[] args) {
        sumEqualsK();
    }
}

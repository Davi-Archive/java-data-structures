package string;

public class SameString {
    public static void main(String[] args) {
        matchingString();
    }

    private static void matchingString() {
        char[] A = "painter".toCharArray();
        char[] B = "painting".toCharArray();
        int arrA = 0, arrB = 0;

        while (arrA < A.length && arrB < B.length) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] != B[i]) {
                    System.out.println("NOT EQUAL");
                }
                arrA++;
                arrB++;
            }
        }


    }
}

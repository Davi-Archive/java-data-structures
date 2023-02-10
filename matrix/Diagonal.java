package matrix;

import java.util.Arrays;

public class Diagonal {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrix[i][j] = i + j + 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}

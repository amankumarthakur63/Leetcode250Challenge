package Matrices;

public class Day30RotateImage {

    public void rotate(int[][] matrix) {
        // calculate the edge length whether it is n * n matrix or not
        int edgeLength = matrix.length;

        // Initialise top and bottom
        int top = 0;
        int bottom = edgeLength - 1;

        // Vertical flip flop
        while (top < bottom) {
            for (int c = 0; c < edgeLength; c++) {
                int temp = matrix[top][c];
                matrix[top][c] = matrix[bottom][c];
                matrix[bottom][c] = temp;
            }
            top += 1;
            bottom -= 1;
        }

        // Transpose
        for (int r = 0; r < edgeLength; r++) {
            for (int c = r + 1; c < edgeLength; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
    }

    public static void main(String[] args) {

    }
}

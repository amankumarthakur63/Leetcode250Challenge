package Matrices;

import java.util.ArrayList;
import java.util.List;

public class Day29SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add (matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int j = top; j <= bottom; j++) {
                result.add (matrix[j][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    result.add (matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                //Traverse from bottom to top
                for (int j = bottom; j >= top; j--) {
                    result.add (matrix[j][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

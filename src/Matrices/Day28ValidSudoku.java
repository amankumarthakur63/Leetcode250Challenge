package Matrices;

import java.util.HashSet;

public class Day28ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row [i] = new HashSet<> ();
            col [i] = new HashSet<> ();
            boxes [i] = new HashSet<> ();
        }
        for (int c = 0; c < 9; c++) {
            for (int r = 0; r < 9; r++) {
                if (board[r][c] == '.') {
                    continue;
                }

                char value = board[r][c];
                int boxIndex = (r / 3) * 3 + (c / 3);

                if (row[r].contains(value) || col[c].contains(value) || boxes[boxIndex].contains(value)) {
                    return false;
                }
                row[r].add(value);
                col[c].add(value);
                boxes[boxIndex].add(value);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

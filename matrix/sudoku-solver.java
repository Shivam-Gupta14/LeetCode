class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) // check row
                return false;
            if (board[row][i] != '.' && board[row][i] == c) // check column
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
                    && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) // check 3x3 box
                return false;
        }
        return true;
    }
}

public class Practice {
    public static void printsudoku(char sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char sudoku[][] = {
            {'4','0','0','0','5','0','0','0','1'},
            {'7','0','1','2','0','4','8','0','0'},
            {'0','2','3','8','0','0','0','0','0'},
            {'9','0','7','0','8','0','5','0','2'},
            {'0','3','0','0','0','0','0','4','0'},
            {'2','0','6','0','4','0','9','0','3'},
            {'0','0','0','0','0','6','2','1','0'},
            {'0','0','9','1','0','3','4','0','8'},
            {'1','0','0','0','9','0','0','0','6'}
        };

        Solution solution = new Solution();
        solution.solveSudoku(sudoku);

        System.out.println("Solution:");
        printsudoku(sudoku);
    }
}

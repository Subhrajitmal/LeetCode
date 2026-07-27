class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] b = new boolean[9][9];

        for(int i=0 ;i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];

                if(ch == '.'){
                continue;
                }
                int num = board[i][j] - '1';
                int box = (i/3)*3+(j/3);
                if(r[i][num] || 
                c[j][num] || 
                b[box][num]){
                 return false;
                }
                r[i][num] = true;
                c[j][num] = true;
                b[box][num] = true;
            }
        }
        return true;
    }
}
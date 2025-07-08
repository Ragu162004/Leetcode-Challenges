class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        int [] rotate= new int[4];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(target[i][j] == mat[i][j]) {
                    rotate[0]++;
                } if(target[i][j] == mat[n - j - 1][i]) {
                    rotate[1]++;
                } if(target[i][j] == mat[n - i - 1][n - j - 1]) {
                    rotate[2]++;
                } if(target[i][j] == mat[j][n - i - 1]) {
                    rotate[3]++;
                }
            }
        }

        for(int i = 0; i < 4; i++) {
            if(rotate[i] == n * n) return true;
        }

        return false;
    }
}
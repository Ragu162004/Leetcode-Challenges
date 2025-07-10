class Solution {

    class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public void setZeroes(int[][] matrix) {
        List<Pair> pair = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0 ;j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    pair.add(new Pair(i,j));
                }
            }
        }

        for(int i = 0 ;i < pair.size(); i++) {
            Pair p = pair.get(i);
            for(int j = 0; j < matrix.length; j++) {
                matrix[j][p.j] = 0;
            }
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[p.i][j] = 0;
            }
        }
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for(int [] row : res) {
            Arrays.fill(row,-1);
        }

        boolean[][] seen = new boolean[res.length][res[0].length];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i < res.length; i++) {
            for(int j = 0;j < res[i].length; j++) {
                if(mat[i][j] == 0) {
                    res[i][j] = 0;
                    seen[i][j] = true;
                    q.offer(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()) {
            int[] idx = q.poll();
            int r = idx[0];
            int c = idx[1];
            int h = res[r][c];

            int [][] directions = {{r + 1, c}, {r, c + 1}, {r - 1, c}, {r, c - 1}};

            for(int [] d : directions) {
                if(d[0] < 0 || d[0] >= res.length || d[1] < 0 || d[1] >= res[d[0]].length || seen[d[0]][d[1]] == true) continue;

                q.offer(new int[]{d[0],d[1]});
                seen[d[0]][d[1]] = true;
                res[d[0]][d[1]] = h + 1;
            }
        }
        return res;
    }

    
}
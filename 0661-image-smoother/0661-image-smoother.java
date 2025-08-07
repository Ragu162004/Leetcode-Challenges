class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        if(m == 1 && n == 1) return img;

        int [][] res = new int[n][m];

        int[][] dirs = {{0, 1}, {1, 0}, {1, 1}, {-1, 0}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}};
        for(int i = 0; i < n; i++) {
            for(int j = 0;j < m; j++) {
                int neighbour_sum = img[i][j];
                int count = 1;
                for(int []dir : dirs) {
                    int nx = i + dir[0];
                    int ny = j + dir[1];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        neighbour_sum += img[nx][ny];
                        count++;
                    }
                }

                res[i][j] = (int) Math.floor((double) neighbour_sum / count);
            }
        }
        return res;
    }
}
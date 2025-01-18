import java.util.PriorityQueue;

class Solution {
    public int minCost(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[][] d = {
            {0, 1}, 
            {0, -1}, 
            {1, 0}, 
            {-1, 0}
        };

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{0, 0, 0});

        boolean[][] visited = new boolean[r][c];

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int x = curr[0], y = curr[1], cost = curr[2];

            if (x == r - 1 && y == c - 1) {
                return cost;
            }

            if (visited[x][y]) {
                continue;
            }
            visited[x][y] = true;

            int dir = grid[x][y] - 1;

            for (int i = 0; i < 4; i++) {
                int nx = x + d[i][0];
                int ny = y + d[i][1];

                if (nx >= 0 && nx < r && ny >= 0 && ny < c && !visited[nx][ny]) {
                    if (i == dir) {
                        pq.offer(new int[]{nx, ny, cost});
                    } else {
                        pq.offer(new int[]{nx, ny, cost + 1});
                    }
                }
            }
        }

        return -1;
    }
}


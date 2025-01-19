class Solution {
    public static class Pair implements Comparable<Pair> {
        int row ;
        int col ;
        int height ;
    
        Pair(int row, int col, int height){
            this.row = row ;
            this.col = col ;
            this.height = height ;
        }
    
        public int compareTo(Pair o){
            return this.height - o.height ;
        }
    
    }

    public int trapRainWater(int[][] heights) {
        int m = heights.length ;
        int n = heights[0].length ;
    
        PriorityQueue<Pair> queue = new PriorityQueue<>() ;
        boolean[][] visited = new boolean[m][n] ;
    
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == m - 1 || j == 0 || j == n - 1){
                    queue.add(new Pair(i, j, heights[i][j])) ;
                    visited[i][j] = true ;
                }
            }
        }

        int water = 0 ;
        int[][] dirs = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        } ;

        while(queue.size() > 0){
            Pair rem = queue.remove() ;
            for(int[] dir : dirs){
                int rdash = rem.row + dir[0] ;
                int cdash = rem.col + dir[1] ;

                if(rdash < 0 || cdash < 0 || rdash >= m || cdash >= n || visited[rdash][cdash])
                    continue ;

                water += Math.max(0, rem.height - heights[rdash][cdash]) ;

                if(heights[rdash][cdash] >= rem.height)
                    queue.add(new Pair(rdash, cdash, heights[rdash][cdash])) ;
                else
                    queue.add(new Pair(rdash, cdash, rem.height)) ;

                visited[rdash][cdash] = true ;
            }
        }
        return water ;
    }
}
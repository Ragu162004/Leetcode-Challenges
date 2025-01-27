class Solution {
    public void fillGraph(boolean[][] graph, int i, boolean[] visited){
        if (visited[i])
            return;
        visited[i] = true;
        for (int j=0;j<graph[i].length;j++){
            if (graph[i][j]){
                fillGraph(graph, j, visited);
                for (int k=0;k<graph[j].length;k++){
                    if (graph[j][k])
                        graph[i][k] = true;
                }
            }
        }
    }
    
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] graph = new boolean[n][n];
        
        for (int i=0;i<n;i++)
            graph[i][i] = true;

        for (int[] entry: prerequisites)
            graph[entry[0]][entry[1]] = true;
        
        boolean[] visited = new boolean[n];
        for (int i=0;i<n;i++)
            fillGraph(graph, i, visited);
        
        List<Boolean> responses = new ArrayList<Boolean>();
        for (int[] query: queries)
            responses.add(graph[query[0]][query[1]]);
        return responses;
    }
}
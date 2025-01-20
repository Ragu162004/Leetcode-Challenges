class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int []rowFreq = new int[n];
        int []colFreq = new int[m];

        Map<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0;j < m; j++) {
                map.put(mat[i][j],new int[]{i,j});
            }
        }

        for(int i = 0; i < arr.length; i++) {
            int []indexes = map.get(arr[i]);
            int rIdx = indexes[0];
            int cIdx = indexes[1];

            rowFreq[rIdx]++;
            colFreq[cIdx]++;

            if(rowFreq[rIdx] == m || colFreq[cIdx] == n) return i;
        }

        return -1;
    }
}
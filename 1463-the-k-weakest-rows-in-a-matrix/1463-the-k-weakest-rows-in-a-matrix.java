class Solution {
    class Pair {
        int idx;
        int soldierCount;
        Pair(int idx, int soldierCount) {
            this.idx = idx;
            this.soldierCount = soldierCount;
        }
    }

    private int getOnes(int[] row) {
        int l = 0, h = row.length;
        while(l < h) {
            int mid = (l + h) / 2;
            if(row[mid] == 1) l = mid + 1;
            else h = mid;
        }
        return l;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        for (int i = 0; i < mat.length; i++) {
            int count = getOnes(mat[i]);
            pq.add(new int[]{i, count});
        }
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty() && k-- > 0) {
            result[i++] = pq.poll()[0];
        }
        return result;
    }
}
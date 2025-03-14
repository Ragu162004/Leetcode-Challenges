class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> seen = new HashSet<>();
        for(String s : wordList) {
            seen.add(s);
        }
        if(!seen.contains(endWord)) return 0;
        int level = 1;
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        seen.remove(beginWord);
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                String curr = q.poll();
                for(int i = 0; i < curr.length(); i++) {
                    char[] temp = curr.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++) {
                        if(c == temp[i]) continue;
                        temp[i] = c;
                        String t = new String(temp);
                        if(t.equals(endWord)) return level + 1;
                        if(seen.contains(t)) {
                            q.offer(t);
                            seen.remove(t);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
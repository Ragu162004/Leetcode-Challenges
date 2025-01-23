class Solution {
    private Set<String> wordDict;
    private Map<String, Integer> memo;

    public int longestStrChain(String[] words) {
    	wordDict = new HashSet<>();
    	Collections.addAll(wordDict, words); 
    	memo = new HashMap<>();

    	int maxPath = 1;
    	for (String word: words) 
    		maxPath = Math.max(maxPath, dfs(word));

    	return maxPath;
    }

    private int dfs(String word) {
    	if (memo.containsKey(word)) return memo.get(word);

    	int maxPath = 0;
    	for (int i=0; i<word.length(); i++) {
    		StringBuilder sb = new StringBuilder(word);
    		sb.deleteCharAt(i);
    		String prevWord = sb.toString();
    		if (wordDict.contains(prevWord)) 
    			maxPath = Math.max(maxPath, dfs(prevWord));
    	}
    
    	memo.put(word, maxPath + 1);
    	return memo.get(word);
    }
}
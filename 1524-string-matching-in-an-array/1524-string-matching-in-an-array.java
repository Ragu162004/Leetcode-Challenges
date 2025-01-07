class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    result.add(words[j]);
                }
            }
        }
        
        Set<String> uniqueResult = new TreeSet<>(result);
        return new ArrayList<>(uniqueResult);
    }
}
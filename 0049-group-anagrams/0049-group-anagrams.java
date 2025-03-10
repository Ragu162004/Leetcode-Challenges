class Solution {
    
    private String freqCalc(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                str.append((char)(i + 'a') + "" + freq[i]);
            }
        }
        return str.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            String freq = freqCalc(str);
            if(!map.containsKey(freq)) {
                map.put(freq, new ArrayList<>());
            }
            map.get(freq).add(str);
        }
        for(List<String> i : map.values()) {
            result.add(i);
        }
        return result;
    }
}
class Solution {
    public int countPoints(String rings) {
        Map<Character,Set<Character>> map = new HashMap<>();
        for(int i = 0;i < rings.length(); i+=2) {
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);
            map.putIfAbsent(rod, new HashSet<>());
            map.get(rod).add(color);
        }

        int count = 0;
        for(Set<Character> values : map.values()) {
            if(values.size() == 3) count++;
        }
        return count;
    }
}
class Solution {
    public int romanToInt(String s) {
        int sol = 0,prev = 0,alt=0;
        for(int i = s.length()-1;i>=0;i--) {
            switch(s.charAt(i)) {
                case 'I': alt = 1; break;
                case 'V': alt = 5; break;
                case 'X': alt = 10; break;
                case 'L': alt = 50; break;
                case 'C': alt = 100; break;
                case 'D': alt = 500; break;
                case 'M': alt = 1000; break;
            }
            if(alt < prev) {
                sol = sol - alt;
            }else {
                sol = sol + alt;
            }
            prev = alt;
        }
        return sol;
    }
}
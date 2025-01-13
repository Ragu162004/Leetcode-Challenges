class Solution {
public:
    int minimumLength(string s) {
        int freq[26];

        for(auto ch : s) {
            freq[ch - 'a']++;
        }
        
        int count = 0;
        for(auto i : freq) {
            if(i > 2) {
                if(i % 2 == 0) count = count + 2;
                else count = count + 1;
            }else {
                count = count + i;
            }
        }

        return count;
    }
};
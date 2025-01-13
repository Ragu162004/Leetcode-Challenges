class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        unordered_map<string,int> map1, map2;
        for(auto word : words1) {
            map1[word]++;
        }

        for(auto word : words2) {
            map2[word]++;
        }

        int count = 0;

        for(auto i : map1) {
            if(i.second == 1 && map2[i.first] == 1) count++;
        }

        return count;

    }
};
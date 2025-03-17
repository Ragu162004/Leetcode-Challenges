class Solution {
public:
    bool divideArray(vector<int>& nums) {
        unordered_map<int, int> map;
        for(auto num : nums) {
            map[num]++;
        }
        for(auto& num : map) {
            if(num.second % 2 != 0) {
                return false;
            }
        }

        return true;
    }
};
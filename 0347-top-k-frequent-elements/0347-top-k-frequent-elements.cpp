class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> m;
        for(auto i : nums) {
            m[i]++;
        }
        priority_queue<pair<int, int>> pq;
        for(auto i : m) {
            pq.push({i.second,i.first});
        }
        vector<int> res;
        for(int i = 0; i < k; i++) {
            pair<int,int> val = pq.top();
            res.push_back(val.second);
            pq.pop();
        }
        return res;
    }
};
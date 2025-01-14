class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int count = 0;
        unordered_set<int> seen;
        vector<int> res(A.size(), 0);

        for(int i = 0;i < A.size(); i++) {
            if(seen.count(A[i])) {
                count++;
            }else {
                seen.insert(A[i]);
            }

            if(seen.count(B[i])) {
                count++;
            }else {
                seen.insert(B[i]);
            }

            res[i] = count;
        }
        return res;
    }
};
class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int count = 0;
        vector<int> freq(A.size() + 1, 0) , res(A.size(), 0);

        for(int i = 0;i < A.size(); i++) {
            if(++freq[A[i]] == 2) count++;
            if(++freq[B[i]] == 2) count++;
            res[i] = count;
        }
        return res;
    }
};
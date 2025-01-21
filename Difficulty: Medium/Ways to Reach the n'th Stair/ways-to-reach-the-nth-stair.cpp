//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {

    static int helper(int n, vector<int> &dp) {
        if(n == 1) return 1;
        if(n == 2) return 2; 
        if(dp[n] != -1) return dp[n];
        dp[n] = helper(n-1, dp) + helper(n-2, dp);
        return dp[n];
    }
    public:
        static int countWays(int n) {
            vector<int>dp(n + 1,-1);
            return helper(n, dp);
        }
};


//{ Driver Code Starts.
int main() {
    // taking total testcases
    int t;
    cin >> t;
    while (t--) {
        // taking stair count
        int m;
        cin >> m;
        Solution ob;
        cout << ob.countWays(m) << endl; // Print the output from our pre computed array

        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends
//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    // Function to return the minimum cost of connecting the ropes.
    int minCost(vector<int>& arr) {
        priority_queue<int,vector<int>,greater<int>> q(arr.begin(),arr.end());
        int sum = 0;
        while(q.size() > 1) {
            int num1 = q.top();
            q.pop();
            int num2 = q.top();
            q.pop();
            int sum1 = num1 + num2;
            sum += sum1;
            q.push(sum1);
        }
        return sum;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        string input;
        int num;
        vector<int> a;

        getline(cin, input);
        stringstream s2(input);
        while (s2 >> num) {
            a.push_back(num);
        }
        Solution ob;
        cout << ob.minCost(a) << endl;
        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {

    void helper(TreeNode * root, map<int, map<int,vector<int>>> &m, int hd, int level) {
        if(root == nullptr) return;

        m[hd][level].push_back(root -> val);
        helper(root -> left, m, hd - 1, level + 1); 
        helper(root -> right, m, hd + 1, level + 1); 
    }
public:
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int, map<int,vector<int>>> m;
        helper(root, m, 0, 0);

        vector<vector<int>> v1;
        for(auto i : m) {
            vector<int> v2;
            for(auto j : i.second) {
                sort(j.second.begin(),j.second.end());
                for(auto val : j.second) {
                    v2.push_back(val);
                }
            }
            v1.push_back(v2);
        }
        return v1;
    }
};
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* insertHelper(struct TreeNode* root, int val) {
    if(root == NULL) {
        struct TreeNode* newNode = (struct TreeNode*) malloc(sizeof(struct TreeNode));
        newNode -> val = val;
        newNode -> left = NULL;
        newNode -> right = NULL;
        return newNode;
    }

    if(root -> val < val) {
        root -> right = insertHelper(root -> right, val);
    }

    else if(root -> val > val) {
        root -> left = insertHelper(root -> left, val);
    }

    return root;

}

struct TreeNode* insertIntoBST(struct TreeNode* root, int val) {
    root = insertHelper(root, val);
    return root;
}
class Solution {
    public boolean class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null) {
            return true;
        }

        if ((minNode != null && root.val <= minNode.val) || (maxNode != null && root.val >= maxNode.val)) {
            return false;
        }

        return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null) {
            return true;
        }

        if ((minNode != null && root.val <= minNode.val) || (maxNode != null && root.val >= maxNode.val)) {
            return false;
        }

        return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }

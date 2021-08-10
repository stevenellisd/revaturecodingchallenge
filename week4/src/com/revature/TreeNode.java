package com.revature;

public class TreeNode<T> {
    TreeNode leftChild;
    TreeNode rightChild;
    T data;

    public TreeNode(T data) {
        TreeNode leftChild = null;
        TreeNode rightChild = null;
        this.data = data;
    }

    public void printLevel(int level) {
        if (level == 1) {
            System.out.println(data.toString());
        }
        else {
            if (leftChild != null) leftChild.printLevel(level-1);
            if (rightChild != null) rightChild.printLevel(level-1);
        }
    }

    //print level order traversal of tree, assuming this node is the parent
    public void printLevelOrder() {
        for(int i=0; i<height(this); i++) {
            printLevel(i);
        }
    }

    public static int height(TreeNode root) {
        if (root == null) return 1;

        int l = height(root.leftChild);
        int r = height(root.rightChild);

        if (l>r) {
            return l+1;
        } else {
            return r+1;
        }
    }
}

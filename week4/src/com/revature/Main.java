package com.revature;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftChild = new TreeNode(2);
        root.rightChild = new TreeNode(3);
        root.rightChild.rightChild = new TreeNode(4);
        root.leftChild.leftChild = new TreeNode(5);
        root.leftChild.leftChild.leftChild = new TreeNode(6);

        root.printLevelOrder();
    }
}

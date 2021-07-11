package com.learnprogramming.BST;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public BinarySearchTree() {
        root=null;
    }
    public void insert(int key)
    {
        root = insertRec(root, key);
    }
     public void inorder()
    {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    private Node insertRec(Node root, int key) {

        if(root ==null){
            root=new Node(key);
            return root;
        }
        if(root.key<key){
            root.right= insertRec(root.right,key);
        }

        if(root.key>key){
            root.left= insertRec(root.left,key);
        }
        return root;
    }
    // A utility function to search a given key in BST
    public Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}

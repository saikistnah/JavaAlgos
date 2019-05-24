package com.sai.datastructures;
class Node {
    private Node leftChild, rightChild;
    static int leftHeight =0;
	static int rightHeight=0;
    
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeftChild() {
        return this.leftChild;
    }
    
    public Node getRightChild() {
        return this.rightChild;
    }

    public int height(Node root) {
        if(root == null) return -1;
		leftHeight =  height(root.getLeftChild());
		rightHeight = height(root.getLeftChild());
		return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height(root));
    }
}
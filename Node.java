package com.greatlearning.lab;

public class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
	public Node insert (Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		if(data< root.data) {
			root.left = insert(root.left , data);
		}else {
			root.right= insert(root.right, data);
		}
		return root;
	}

}

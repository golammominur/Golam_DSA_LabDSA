package com.greatlearning.lab;

public class Driver {

	public static void main(String[] args) {
	Node root = new Node(40);
		root.insert(root, 20);
		root.insert(root, 60);
		root.insert(root, 10);
		root.insert(root, 30);
		root.insert(root, 50);
		root.insert(root, 70);
		
		BinaryTree sumPair = new BinaryTree();
		sumPair.checkpairPresent(root, 130);
		
		
		

	}


	}



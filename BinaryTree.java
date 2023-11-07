package com.greatlearning.lab;

import java.util.HashSet;
import java.util.Set;

public class BinaryTree {
	public void checkpairPresent(Node root, int sum) {
		Set<Integer> set = new HashSet<>();
		if (!isPairPresent(root, sum, set)) {
			System.out.println("nodes are not found");
		}
	}
	private boolean isPairPresent(Node root, int sum, Set<Integer> set) {
		if (root == null) {
			return false;
	}
		if (isPairPresent(root.left, sum , set)) {
			return true;
		}
		if (set.contains(sum - root.data)) {
			System.out.println("Sum = " + sum);
			System.out.println("Pair is (" + (sum - root.data) + "," + root.data + ")");
			return true;
		}else {
			set.add(root.data);
		}
     return isPairPresent(root.right , sum , set);
}
}

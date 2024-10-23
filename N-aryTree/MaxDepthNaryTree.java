/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class MaxDepthNaryTree {
	static List<List<Integer> > result = new ArrayList<>();
	static int level = 0;
	static class Node {

		public int val;
		public Vector<Node> children;
		public Node(int key)
		{
			val = key;
			children = new Vector<Node>();
		}
	}

	// Utility function to create a new tree node
	static Node newNode(int key)
	{
		Node temp = new Node(key);
		return temp;
	}

	// method to find level order traversal of n-ary tree
	static void levelOrder(Node node)
	{
		if (node == null) {
			return;
		}
		List<Integer> list = result.size() > level
								? result.get(level)
								: new ArrayList<>();
		// adding node value to the list
		list.add(node.val);
		if (result.size() <= level) {
			result.add(list);
		}
		// promoting/incrementing the level to next
		level++;
		for (Node n : node.children) {
			levelOrder(n);
		}
		level--;
	}

	// utility function to print level order traversal
	public static void printList(List<List<Integer> > temp)
	{
		for (List<Integer> it : temp) {
			for (Integer et : it)
				System.out.print(et + " ");
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Node root = newNode(1);
		(root.children).add(newNode(3));
		(root.children).add(newNode(2));
		(root.children).add(newNode(4));
		(root.children.get(0).children).add(newNode(5));
		(root.children.get(0).children).add(newNode(6));
		levelOrder(root);
		printList(result);
	}
}

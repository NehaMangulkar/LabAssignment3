package com.learning.bst;

import java.util.HashSet;
import java.util.Set;

public class FindPairOfSum {
 static Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			super();
			this.data=data;
			
		}
		
	}
	public FindPairOfSum()
	{
		root = null;
	}
	void insert(int key)
	{
		root = insertKey(root, key);
		
	}
	
	Node insertKey(Node root, int key)
	{
		if(root==null)
		{
			root = new Node(key);
			return root;
			
		}
		if(key<root.data)
		{
			root.left = insertKey(root.left , key);
		}
		else if(key>root.data)
		{
			root.right = insertKey(root.right , key);
		}
		return root;
		
	}
	
	void inorder()
	{
		inorderRect(root);
	}
	
	void inorderRect(Node root)
	{
		if(root !=null)
		{
			inorderRect(root.left);
			System.out.println(root.data + "-->");
			inorderRect(root.right);
		}
	}
	
	
	public static void main(String[] args) {
		
		FindPairOfSum tree= new FindPairOfSum();
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		tree.inorder();
		System.out.println();
		int sum=60;
		tree.findPairWithGivenSum(root , sum);
		
	}
	
	void findPairWithGivenSum(Node root, int sum)
	{
		Set<Integer> set =new HashSet<Integer>();
		
		if(!findPairUtil(root,sum,set))
		{
			System.out.println("Pairs do not exsists");
			
			
		}
	}
		
		private boolean findPairUtil(Node root,int sum, Set<Integer> set)
		{
			if(root == null)
			{
				return false;
			}
			if (findPairUtil(root.left,sum,set))
			{
				return true;
			}
			if(set.contains(sum - root.data))
			{
				System.out.println("Pair is found (" + (sum - root.data) + "," + root.data + ")");
				return true;
			}
			else
			{
				set.add(root.data);
			}
			return findPairUtil(root.right,sum,set);
		}
		
		
	}



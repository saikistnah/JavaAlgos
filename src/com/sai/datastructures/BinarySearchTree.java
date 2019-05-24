/**
 * 
 */
package com.sai.datastructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author NEETHU
 *
 */
public class BinarySearchTree {
	static BinaryTree rootNode;
	
	//root-->left-->right
	public static void preOrder(BinaryTree node){
		if(node == null) return;
		System.out.print(node.num+" ");
		preOrder(node.leftNode);
		preOrder(node.rightNode);
	}
	
	public static void inOrder(BinaryTree node){
		if(node == null) return;
		inOrder(node.leftNode);
		System.out.print(node.num+" ");
		inOrder(node.rightNode);
	}
	
	public static void postOrder(BinaryTree node){
		if(node == null) return;
		postOrder(node.leftNode);
		postOrder(node.rightNode);
		System.out.print(node.num+" ");
	}
	
	
	public static void insertNumbers(BinaryTree node,int left,int right){
		node.leftNode =  new BinaryTree(left);
		node.rightNode = new BinaryTree(right);
	}
	static int leftHeight =0;
	static int rightHeight=0;
	public static int findHeight(BinaryTree node){
		if(node == null) return -1;
		leftHeight =  findHeight(node.leftNode);
		rightHeight = findHeight(node.rightNode);
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	static HashMap<Integer, Integer> hmap = new HashMap<>();
	
	public static int verticalHeight(BinaryTree node){
		
		if(node == null) return -1;
		
		BinaryTree root = node;
		int number=0;
		hmap.put(number, root.num);
		while(root !=null){
			if(root.leftNode !=null){
				number++;
				hmap.put(number*-1, root.leftNode.num);
				if(root.leftNode.rightNode !=null)
				hmap.put(0, hmap.get(0)+root.leftNode.rightNode.num);
			}
			root=root.leftNode;
		}
		root = node;
		number=0;
		while(root !=null){
			if(root.rightNode !=null){
				number++;
				hmap.put(number, root.rightNode.num);
				if(root.rightNode.leftNode !=null)
				hmap.put(0, hmap.get(0)+root.rightNode.leftNode.num);
			}
			root=root.rightNode;
		}
		return hmap.get(0);
	}
	
	public static int widthfoTree(BinaryTree node){
		Queue<BinaryTree> qu =new LinkedList<>() ;
		if(node!=null)
		qu.add(node);
		else
			return -1;
		int max = 0;
		while(!qu.isEmpty()){
			int len = qu.size();
			for(int i=0;i<len;i++){
				BinaryTree root = qu.poll();
				if(root.leftNode!=null)
					qu.add(root.leftNode);
				if(root.rightNode!=null)
					qu.add(root.rightNode);
			}
			max=Math.max(max, len);
		}
		return max;
		
	}
	
	public static BinaryTree findAncestor(BinaryTree root,int n1,int n2){
		if(root==null)return null;
		if(root.num==n1||root.num==n2)return root;
		
		BinaryTree left=findAncestor(root.leftNode,n1,n2);
		BinaryTree right=findAncestor(root.rightNode,n1,n2);
		if(left !=null&&right !=null) return root;
		return left!=null?left:right;
	}
	
	public static int getdepth(BinaryTree root,int num){
		if(root==null)return -1;
		if(root.num==num)return 0;
		int left=getdepth(root.leftNode,num);
		int right=getdepth(root.rightNode,num);
		return left!=-1?left+1:right+1;
		
	}
	
	public static void pathwithSum(BinaryTree root,int sum){
		if(root==null)return;
		Stack<Integer> s1=new Stack<>();
		int curr=0;
		findThePath(root,sum,s1,curr);
	}
	
	public static void findThePath(BinaryTree root, int sum, Stack<Integer> s1, int curr){
		
		curr+=root.num;
		s1.push(root.num);
		
		boolean isleaf=root.leftNode==null&&root.rightNode==null;
		if(curr==sum&&isleaf){
			System.out.println("found the path");
			for(Integer i:s1){
				System.out.println(i); 
			}
		}
		if(root.leftNode!=null)
			findThePath(root.leftNode,sum,s1,curr);
		if(root.rightNode!=null)
			findThePath(root.rightNode,sum,s1,curr);
		s1.pop();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		rootNode = new BinaryTree(11);
		insertNumbers(rootNode,9,14);
		insertNumbers(rootNode.leftNode,8,10);
		insertNumbers(rootNode.rightNode,12,15);
		/*System.out.println("-----preOder------");
		preOrder(rootNode);
		System.out.println("\n-----inOrder------");
		inOrder(rootNode);
		System.out.println("\n-----postOrder------");
		postOrder(rootNode);
		System.out.println("\n-----------------------height---------------");
		System.out.println(findHeight(rootNode));
		System.out.println("-----------------------vertical height---------------");
		System.out.println(verticalHeight(rootNode));
		System.out.println("-----------------------Width---------------");
		System.out.println(widthfoTree(rootNode));
		System.out.println("-----------------------Ancestor---------------");
		System.out.println(findAncestor(rootNode,12,8).num);
		System.out.println("-----------------------depth---------------");
		System.out.println(getdepth(rootNode,12));
		System.out.println("-----------------------distance between 2 nodes---------------");
		int anc =findAncestor(rootNode,12,8).num;
		int d1=getdepth(rootNode,anc);
		int d2=getdepth(rootNode,12);
		int d3=getdepth(rootNode,8);
		System.out.println(d2+d3-2*d1);*/
		System.out.println("-----------------------pathSum---------------");
		pathwithSum(rootNode,40);
		
		

	}

}

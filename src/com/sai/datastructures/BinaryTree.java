/**
 * 
 */
package com.sai.datastructures;

/**
 * @author Saikrishna Gudla
 *
 */
public class BinaryTree {
	BinaryTree leftNode;
	BinaryTree rightNode;
	int num;
	public BinaryTree(int num){
		this.num=num;
	}
	
	public BinaryTree(){
		leftNode=rightNode=null;
	}
	
	public void setNum(int num){
		this.num=num;
	}

}

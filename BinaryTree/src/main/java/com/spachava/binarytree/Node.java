package com.spachava.binarytree;

public class Node {
	private Node leftChild = null;
	private Node rightChild = null;
	private Node parentNode = null;
	private int num = 0;
	
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Node(Node parentNode, int num){
		this.parentNode = parentNode;
		this.num = num;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public Node getParentNode() {
		return parentNode;
	}

	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}

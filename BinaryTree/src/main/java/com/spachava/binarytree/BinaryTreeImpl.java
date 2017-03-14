package com.spachava.binarytree;

public class BinaryTreeImpl implements BinaryTree {

	private Node rootNode = null;
	
	@Override
	public void addNum(int num) {
		// a method to add a number to the tree
		Node node = rootNode;
		if(node == null){
			node = new Node();
			node.setNum(num);
			rootNode = node;
		}
		else{
			Node previousNode = new Node();
			
			while(node != null){
				previousNode = node;
				
				if(num < node.getNum()){
					node = node.getLeftChild();
				} else
					node = node.getRightChild();
				
			}
			
			node = new Node();
			
			if(num < previousNode.getNum()){
				previousNode.setLeftChild(node);
			} else
				previousNode.setRightChild(node);
			
			node.setNum(num);
			node.setParentNode(previousNode);
		}
		
		node = null;

	}

	@Override
	public void removeNum(int num) {
		// TODO Auto-generated method stub
		Node node = rootNode;
		Node previousNode = new Node();
		
		while(node.getNum() != num){
			previousNode = node;
			
			if(num < node.getNum()){
				node = node.getLeftChild();
			} else
				node = node.getRightChild();
			
		}
		
		if(num < previousNode.getNum()){
			previousNode.setLeftChild(null);
		} else
			previousNode.setRightChild(null);
	
		node = null;
	}

	@Override
	public Node getRootNode() {
		// TODO Auto-generated method stub
		return rootNode;
	}

	@Override
	public String getSortedNumbers() {
		// TODO Auto-generated method stub
		
		return null;
	}

}

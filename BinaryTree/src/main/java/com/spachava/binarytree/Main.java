package com.spachava.binarytree;

public class Main {
	public static void main(String[] args){
		System.out.println("HELLO ");
		String[] myArgs = {"2", "4", "3", "1", "5", "10", "2121212", "444", "7"};
		
		Integer num = null;
		BinaryTree binaryTree = new BinaryTreeImpl();
		
		for(int i = 0; i < myArgs.length; i++){
			num = Integer.parseInt(myArgs[i]);
			System.out.println("NUM IS EQUAL TO: " + num);
			binaryTree.addNum(num);
		}
		
		
		System.out.println("FINISHED");
		System.out.println(binaryTree.getSortedNumbers());
	}
}

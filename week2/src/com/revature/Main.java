package com.revature;

public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack();

	    stack.push(1);
	    stack.push(2);
		stack.push(3);
		stack.push(4);
		for(int i=0; i<5; i++) {
			System.out.println(stack.pop());
		}
		System.out.println("");
		Subarray.find(new int[]{14, 12, 70, 15, 99, 65, 21, 90}, 97);
    }

}

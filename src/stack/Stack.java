package stack;

import list.LinkedList;

public class Stack {
	LinkedList stack;
	
	public Stack(){
		stack = new LinkedList();
	}
	
	public void enqueue(int value){
		stack.push(value);
	}
	
	public int dequeue() {
		return stack.pop().getValue();
	}
}

package tree;

public class Node {
	Node left;
	Node right;
	int value;
	
	public Node(int value){
		this.value = value;
		left = null;
		right = null;
	}
	
	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public int getValue(){
		return value;
	}
}

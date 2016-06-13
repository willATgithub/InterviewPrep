package list;

public class Node {
	public Node next;
	public Node prev;
	public int value;
	public Node(int value) {
		next = null;
		this.value = value;
	}
	
	public Node(Node next, int value) {
		this.next = next;
		this.value = value;
	}
	
	public Node(Node prev, Node next, int value) {
		this.next = next;
		this.prev = prev;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}
	
	public static boolean containsCycle(Node head) {
		Node current = head;
		while (current.next != null) {
			Node innerCurrent = current.next;
			while (innerCurrent != null){
				if (innerCurrent == current) {
					return true;
				}					
				innerCurrent = innerCurrent.next;
			}
			current = current.next;
		}
		return false;
	}
	
	public String toString() {
    	return String.valueOf(this.value);
    }
}

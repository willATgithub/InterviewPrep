package list;

public class DoubleLinkedNode extends Node {
	public Node prev;
	public DoubleLinkedNode(int value) {
		super(value);
		prev = this;
		next = this;
	}
	
	public DoubleLinkedNode(Node prev, Node next, int value) {
		super(next,value);
		this.prev = prev;
	}
	
	public int getValue() {
		return value;
	}

	public void setNext(DoubleLinkedNode next) {
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
        String nextNode = (this.next == null) ? "" : "," + this.next.toString();
    	return this.value + nextNode;
    }
}

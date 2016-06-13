package list;

public class DoubleLinkedList implements List {
	Node head;
	public DoubleLinkedList() {
		head = null;
	}

	public DoubleLinkedList(int value) {
		head = new Node(value);
	}
	
	public void insert(int value) {
		if (head == null) {
			head = new Node(value);
			head.next = head;
			head.prev = head;
			return;
		}
		
		Node insert = new Node (head.prev,head,value);
		insert.prev.next = insert;
		insert.next.prev = insert;
	}
	
	public void insertSorted(int value) {
		if (head == null ){
			head = new Node(value);
			head.prev = head;
			head.next = head;
			return;
		}
		Node insert = new Node(head.prev,head,value);
		if (head.value >= value) {
			swap(head,insert);
			insert.prev.next = insert;
			insert.next.prev = insert;
			return;
		}
		
		Node current = head;
		while (current.next != head && (current.next.value < value)){
			current = current.next;
		}
	
	    insert.next = current.next;
		current.next = insert;
	}

	public Node tail() {
		Node nextNode = head;
    	while(nextNode.next != head){
    		nextNode = nextNode.next;
    	}
    	return nextNode;
	}
	
	public Node find(int value) {
	    Node current = head;
	   	while(current.next != null && current.value != value) {
	   		current = current.next;
	   		if (current == head) {
	   			return null;
	   		}
    	}
	   	return current;
	}
	
    public void reverse() {
    	Node tail = head;
    	do {
    		Node temp = tail.next;
    		tail.next = tail.prev;
    		tail.prev = temp;
    		tail = temp;
    	} while(tail != head);
    	head = head.prev;	
    }
    
	public void remove(int value) {
		if (head.next == head) {
			head = null;
		}
		
		Node node = find(value);
		node.prev.next = node.next;
		node.next.prev = node.prev;
		if (head == node) {
			head = node.next;
		}
	}
	
	public void swap(Node head, Node insert){
		int temp = head.value;
		head.value = insert.value;
		insert.value = temp;
	}
	
	public String circularToString() {
		Node current = head;
		String retval = "";
		if (head == null) {
			return retval;
		}
		do {
			retval += current.value + ",";
			current = current.next;
		} while (current != head);
    	return retval;
    }

    public String toString() {
    	return "[" + circularToString() + "]";
    }

	@Override
	public void removeValues(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node findNthFromTheEnd(int i) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node findMiddle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getHead() {
		return head;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

}

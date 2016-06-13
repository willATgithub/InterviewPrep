package list;
public class CircularLinkedList implements List{
    Node head;
    public CircularLinkedList() {
    	head = null;
    }
    
    public CircularLinkedList(int value) {
    	head = new Node(value);
    	head.next = head;
    }

    public void insert(int value) {
    	if (head == null) {
    		head = new Node(value);
    		head.next = head;
    		return;
    	}
    	//System.out.println("inserting second value :" + value);

    	if (head.next == head){
    		head.next = new Node(head,value);
    		
    		return;
    	}
    	Node insert = new Node(value);
    	//System.out.println("inserting more than two values");
    	swap(head, insert);
    	insert.next = head.next;
    	head.next = insert;
    }
    
    public void insertSorted(int value) {
		if (head == null ){
    		head = new Node(value);
    		head.next = head;
    		return;
		}
		Node insert = new Node(value);
		if (head.value >= value) {
			swap(head,insert);
			insert.next = head.next;
			head.next = insert;
			return;
		}
		
		Node current = head;
		while (current.next != head && (current.next.value < value)){
			current = current.next;
		}

        insert.next = current.next;
		current.next = insert;
    }

	public void remove(int value) {
		if (head.value == value && head == head.next) {
			head = null;
            return;
		}
		
		Node target = find(value);
		remove(target);
	}
	
	public void removeValues(int value){
		if (head.value == value && head == head.next) {
			head = null;
            return;
		}
		
		if (head.value == value) {
			remove(head);
			return;
		}
    	Node current = head.next;
    	while(current != head) {
    		if (current.next.value == value) {
    			current.next = current.next.next;
    		} else {
    			current = current.next;
    		}
    	}
	}

    public void remove(Node target) {
    	if (target == target.next) {
    		target = null;
    		return;
    	}
    	
    	Node next = target.next;
    	target.value = next.value;
    	target.next = next.next;
    	return;
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
    
	public void swap(Node head, Node insert){
		int temp = head.value;
		head.value = insert.value;
		insert.value = temp;
	}
	
    public Node tail() {
    	Node nextNode = head;
    	while(nextNode.next != head){
    		nextNode = nextNode.next;
    	}
    	return nextNode;
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
    
    public Node findMiddle(){
    	int count = 0;
    	Node current = head;
    	while (current.next != head) {
    		current = current.next;
    		count++;
    	}
    	int middle = count/2;
    	current = head;
    	for (int i = 0;i < middle;i++){
    		current = current.next;
    	}
    	return current;
    }

    public Node findMiddleFast(){
    	Node slow = head;
    	Node fast = head;
    	while (fast.next != head) {
    		fast = fast.next;
    		if (fast.next != head) {
    			fast = fast.next;
        		slow = slow.next;
    		}
    	}
    	return slow;
    }

    public Node findNthFromTheEnd(int nth) {
    	Node nthNode = head;
    	Node leading = head;
    	
    	for (int i = 0; i < nth - 1; i++) {
    		if (leading.next != head) { 
    			leading = leading.next;
    		} else {
    			return null;
    		}
    	}
    	while (leading.next != head) {
    		leading = leading.next;
    		nthNode = nthNode.next;
    	}
    	return nthNode;
    }

	@Override
	public Node getHead() {
		return head;
	}

	public int getLength() {
		int count = 0;
		Node curr = head;
		if (head == null) {
			return count;
		}
		
		do {
			count++;
			curr = curr.next;
		} while (curr != head);
		return count;
	}
}
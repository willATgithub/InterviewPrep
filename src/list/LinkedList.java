package list;
public class LinkedList implements List{
	    public Node head;

	    public LinkedList() {
	    	head = null;
	    }

	    public LinkedList(int value) {
	    	head = new Node(value);
	    }

	    public void push(int value) {
	    	if (head == null) {
	    		head = new Node(value);
	    		return;
	    	}
	    	
	    	Node newHead = new Node(head,value);
	    	head = newHead;
	    }
	    
	    public Node pop(){
	    	Node retval = head;
	    	head = head.next;
	    	return retval;
	    }
	    
	    public void insert(int value) {
	    	if (head == null) {
	    		head = new Node(value);
	    		return;
	    	}
	    	
	    	Node tail = tail();
			tail.next = new Node(value);
	    }
		
	    public Node tail() {
	    	Node nextNode = head;
	    	while(nextNode.next != null){
	    		nextNode = nextNode.next;
	    	}
	    	return nextNode;
	    }

	    public void insertSorted(int value) {
			if (head == null ){
				head =  new Node(value);
				return;
			}
			
			if (head.value >= value) {
				head = new Node(head,value);
				return;
			}
			
			Node current = head;
			while (current.next != null && (current.next.value < value)){
				current = current.next;
			}
			if (current.next == null) {
				current.next = new Node(value);
			} else {
				current.next = new Node(current.next,value);
			}
	    }
	    
	    public void remove(int value) {
	    	Node target = find(value);
	    	remove(target);
	    }
	    
	    public void reverse() {
	    	Node prev = null;
	    	while (head != null) {
	    		Node temp = head.next;
	    		head.next = prev;
	    		prev = head;
	    		head = temp;
	    	}
	    	head = prev;
	    }
	    
	    public void remove(Node target) {
	    	if (head == target){
	    		head = head.next;
	    		return;
	    	}
	    	Node temp = head;
	    	while (temp.next != null && target != temp.next){
	    		temp = temp.next;
	    	}
	    	if (target == temp.next) {
	    		temp.next = temp.next.next;
	    	}
	    }

	    public Node find(int value) {
	    	Node current = head;
			while(current.next != null && current.value != value) {
				current = current.next;
			}
			if (current.value == value) {
				return current;
			} else {
				return null;
			}
		}
	    
	    public String toString() {
	    	String retval = "";
	    	Node current = head;
	    	while (current != null) {
	    		retval += current.value + ",";
	    	    current = current.next;
	    	}
	    	return "[" + retval + "]";
	    }

		@Override
		public void removeValues(int value) {
			// TODO Auto-generated method stub
			
		}

		public Node findNthFromTheEnd(int nth) {
			Node lead = head;
			Node follow = head;

			while (lead != null) {
				for (int i = 0;i< nth;i++) {
					if (lead != null) {
					    lead = lead.next;
					} else {
						return null;
					}
				}
				lead = lead.next;
				follow = follow.next;
			}
			return follow;
		}

		public Node findMiddle() {
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

		@Override
		public Node getHead() {
			return head;
		}

		public int getLength() {
			int count = 0;
			if (head == null) {
				return count;
			}
			
			do {
				count++;
				head = head.next;
			} while (head != null);
			return count;
		}
}

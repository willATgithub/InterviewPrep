import list.LinkedList;

public class DeleteNode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList("A");
		LinkedList b = new LinkedList("B");
		LinkedList c = new LinkedList("C");

		a.next = b;
		b.next = c;
        System.out.print(a.toString());
		deleteNode(b);
		System.out.println(a.toString());
		LinkedListNode d = new LinkedListNode("D");
		c.next = d;
		System.out.println(a.toString());
		deleteNode(a);
		System.out.println(a.toString());
		deleteNode(d);
		System.out.println(a.toString());
		

	}

	private static void deleteNode(LinkedListNode toBeDeleted) throws Exception {
		LinkedListNode nextNode = toBeDeleted.next;
		if (nextNode != null){
			toBeDeleted.value = nextNode.value;
			toBeDeleted.next = nextNode.next;
		} else {
			throw new Exception("Can't delete the last node!");
		}
		
	}

}
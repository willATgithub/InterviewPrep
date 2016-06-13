package list;

public class ListFactory {
	public List getList(String listType) {
		if (listType == null) {
			return null;
		}
		
		if (listType.equalsIgnoreCase("LinkedList")) {
			return new LinkedList();
		} else if (listType.equalsIgnoreCase("CircularLinkedList")) {
			return new CircularLinkedList();
		} else if (listType.equalsIgnoreCase("DoubleLinkedList")) {
			return new DoubleLinkedList();
		}
		return null;
	}

}

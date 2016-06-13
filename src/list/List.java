package list;

public interface List {
	public void insert(int value);
	public void insertSorted(int value);
	public void remove(int value);
	public void removeValues(int value);
	public Node find(int value);
	public Node findNthFromTheEnd(int i);
	public Node findMiddle();
	public Node getHead();
	public int getLength();
}

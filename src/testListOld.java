import java.util.ArrayList;

import list.CircularLinkedList;
import list.DoubleLinkedList;
import list.LinkedList;
import list.Node;

public class testListOld {

	public static void main(String[] args) {
		ArrayList<list.List> list = new ArrayList<list.List>();
		list.add(new LinkedList());
		list.add(new CircularLinkedList());
		list.add(new DoubleLinkedList());
		
		for (list.List item : list) {
			System.out.println("***** Testing class : "  + item.getClass().getName() + " *****");
			execute(item);
		}
	}
	
	public static void execute(list.List list) {
		
		int [] insert = {8,2,5,7};
		testInsert(list,insert);
		
		//Node tail = list.tail();
		
		//System.out.println("tail " + tail);
		int [] find = {2,3,8,12};
		testFind(list,find);
		
		int [] insertSorted = {1,2,22,12,3,9,19,4};
		testInsertSorted(list,insertSorted);
		
		System.out.println("find 2nd from end :" + list.findNthFromTheEnd(2));
		System.out.println("    findMiddle    :" + list.findMiddle());
		System.out.println("findMiddleFast    :" + list.findMiddle());

		int [] remove = {12,8,9};
		testRemove(list,remove);
		
		int [] removeValues = {1,2,5,8,22,9};
		testRemoveValues(list,removeValues);
		
		System.out.println("find 2nd from end :" + list.findNthFromTheEnd(2));
		System.out.println("    findMiddle    :" + list.findMiddle());
		System.out.println("findMiddleFast    :" + list.findMiddle());
		
		System.out.println("containsCycle " + Node.containsCycle(list.getHead()));
	}
	
	public static void testInsert(list.List list, int [] testData) {
		for (int value : testData) {
			list.insert(value);
			System.out.println("insert " + value + " :" + list);
		}
	}
	
	public static void testFind(list.List list, int[] testData) {
		for (int value : testData ) {
		    Node found = list.find(value);
			System.out.println("searching for " + value + ":" + ((found != null) ? "true" : "false"));		
		}
	}
	
	public static void testInsertSorted(list.List list, int[] testData) {
		for (int value : testData) {
			list.insertSorted(value);
			System.out.println("insertSorted " + value + " :" + list);
		}
	}
	
	public static void testRemove(list.List list, int[] testData) {
		for (int value : testData) {
			list.remove(value);
			System.out.println("remove " + value + " :" + list);
		}
	}
	
	public static void testRemoveValues(list.List list, int[] testData) {
		for (int value : testData) {
			list.removeValues(value);
			System.out.println("removeValues " + value + " :" + list);
		}
	}
}

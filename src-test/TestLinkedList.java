

import list.List;
import list.ListFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinkedList {
	@Test
	public void testLinkedListisEmptygetLength() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		assertEquals(0, list.getLength());
	}
	
	@Test
	public void testLinkedListInsertEight() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		list.insert(8);
		assertEquals("[8,]", list.toString());
	}
	
	@Test
	public void testLinkedListInsertEightAndTwo() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		list.insert(8);
		list.insert(2);
		assertEquals("[8,2,]", list.toString());
	}
	
	@Test
	public void testLinkedListOneItemgetLength() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		list.insert(8);
		assertEquals(1, list.getLength());
	}
	
	@Test
	public void testLinkedListTwoItemsgetLength() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		list.insert(8);
		list.insert(2);
		assertEquals(2, list.getLength());
	}
	
	@Test
	public void testLinkedListTwoItemsremoveOnegetLength() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		list.insert(8);
		list.insert(2);
		list.remove(2);
		assertEquals(1, list.getLength());
	}

	@Test
	public void testLinkedListTwoItemsremoveHeadgetLength() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		list.insert(8);
		list.insert(2);
		list.remove(8);
		assertEquals(1, list.getLength());
	}
	
	
}

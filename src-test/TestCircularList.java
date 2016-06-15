

import list.List;
import list.ListFactory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

public class TestCircularList {
	@Rule
    public Timeout globalTimeout = Timeout.seconds(TestConstants.TEST_TIMEOUT); // 10 seconds max per method tested

	@Test
	public void testCircularLinkedListisEmptygetLength() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		assertEquals(0, list.getLength());
	}
	
	@Test
	public void testCircularLinkedListInsertEight() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		list.insert(8);
		assertEquals("[8,]", list.toString());
	}
	
	@Test
	public void testCircularLinkedListInsertEightAndTwo() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		list.insert(8);
		list.insert(2);
		assertEquals("[8,2,]", list.toString());
	}
	
	@Test
	public void testCircularLinkedListOneItemgetLength() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		list.insert(8);
		assertEquals(1, list.getLength());
	}
	
	@Test
	public void testCircularLinkedListTwoItemsgetLength() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		list.insert(8);
		list.insert(2);
		assertEquals(2, list.getLength());
	}
	
	@Test
	public void testCircularLinkedListTwoItemsremoveOnegetLength() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		list.insert(8);
		list.insert(2);
		list.remove(2);
		assertEquals(1, list.getLength());
	}

	@Test
	public void testCircularLinkedListTwoItemsremoveHeadgetLength() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		list.insert(8);
		list.insert(2);
		list.remove(8);
		assertEquals(1, list.getLength());
	}
	
	
}

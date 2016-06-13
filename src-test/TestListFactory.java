import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import list.CircularLinkedList;
import list.DoubleLinkedList;
import list.LinkedList;
import list.List;
import list.ListFactory;

public class TestListFactory {
	@Test
	public void testInstanceOfLinkedList() throws Exception {
		List list = new ListFactory().getList("LinkedList");
		assertThat(list, instanceOf(LinkedList.class));
	}

	@Test
	public void testInstanceOfDoubleLinkedList() throws Exception {
		List list = new ListFactory().getList("DoubleLinkedList");
		assertThat(list, instanceOf(DoubleLinkedList.class));
	}
	
	@Test
	public void testInstanceOfCircularLinkedList() throws Exception {
		List list = new ListFactory().getList("CircularLinkedList");
		assertThat(list, instanceOf(CircularLinkedList.class));
	}
	
	@Test
	public void testForNullWhenInvalidLabelPassedToFactory() throws Exception {
		List list = new ListFactory().getList("wrong");
		assertNull(list);
	}
	
	@Test
	public void testForNullString() throws Exception {
		List list = new ListFactory().getList(null);
		assertNull(list);
	}
	
}

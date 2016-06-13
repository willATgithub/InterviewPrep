import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestMaxStack {
	@Test
	public void testMaxListConstructor() throws Exception {
		MaxStack stack = new MaxStack();
		assertThat(stack, instanceOf(MaxStack.class));
	}
	
	@Test
	public void testMaxListpush() {
		MaxStack stack = new MaxStack();
		assertEquals(Integer.valueOf(0),stack.push(Integer.valueOf(0)));
	}
	
	@Test
	public void testMaxListpeek() {
		MaxStack stack = new MaxStack();
		stack.push(Integer.valueOf(0));
		assertEquals(Integer.valueOf(0),stack.peek());
	}	
	
	@Test
	public void testMaxListGetMaxonSingleElement() {
		MaxStack stack = new MaxStack();
		stack.push(Integer.valueOf(0));
		assertEquals(Integer.valueOf(0),stack.getMax());
	}	

	@Test
	public void testMaxListgetMaxofThree() {
		MaxStack stack = new MaxStack();
		stack.push(Integer.valueOf(0));
		stack.push(Integer.valueOf(3));
		assertEquals(Integer.valueOf(3),stack.getMax());
	}	
	
	@Test
	public void testMaxListgetMaxofZero() {
		MaxStack stack = new MaxStack();
		stack.push(Integer.valueOf(0));
		stack.push(Integer.valueOf(3));
		stack.pop();
		assertEquals(Integer.valueOf(0),stack.getMax());
	}
	
	@Test
	public void testMaxListgetMaxofFive() {
		MaxStack stack = new MaxStack();
		stack.push(Integer.valueOf(2));
		stack.push(Integer.valueOf(5));
		stack.push(Integer.valueOf(7));
		stack.pop();
		assertEquals(Integer.valueOf(5),stack.getMax());
	}
	
	@Test
	public void testMaxListgetMaxofTwo() {
		MaxStack stack = new MaxStack();
		stack.push(Integer.valueOf(2));
		stack.push(Integer.valueOf(5));
		stack.push(Integer.valueOf(7));
		assertEquals("1: size", 3,stack.stack.size());
		stack.pop();
		stack.pop();
		assertEquals("2: peeking",Integer.valueOf(2),stack.peek());
		assertEquals("3: getMax",Integer.valueOf(2),stack.getMax());
	}
}

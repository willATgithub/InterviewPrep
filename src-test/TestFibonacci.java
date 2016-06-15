import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
public class TestFibonacci {
	@Rule
    public Timeout globalTimeout = Timeout.seconds(2); // 10 seconds max per method tested

	@Test
	public void testInstanceOfFibonacci() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertThat(fib, instanceOf(Fibonacci.class));
	}
	
	@Test
	public void testFibonacci_naiveFib0() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 0 should return 0",0, fib.naiveFib(0));
	}
	
	@Test
	public void testFibonacci_naiveFib1() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 1 should return 1",1, fib.naiveFib(1));
	}
	
	@Test
	public void testFibonacci_naiveFib2() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 2 should return 1",1, fib.naiveFib(2));
	}
	
	@Test
	public void testFibonacci_naiveFib3() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 3 should return 2",2, fib.naiveFib(3));
	}
	
	@Test
	public void testFibonacci_naiveFib4() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 4 should return 3",3, fib.naiveFib(4));
	}
	
	@Test
	public void testFibonacci_naiveFib24() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 24 should return 46368",46368, fib.naiveFib(24));
	}
	
	@Test
	public void testFibonacci_memoizeFib0() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 0 should return 0",0, fib.memoizeFib(0));
	}
	
	@Test
	public void testFibonacci_memoizeFib1() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 1 should return 1",1, fib.memoizeFib(1));
	}
	
	@Test
	public void testFibonacci_memoizeFib2() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 2 should return 1",1, fib.memoizeFib(2));
	}
	
	@Test
	public void testFibonacci_memoizeFib3() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 3 should return 2",2, fib.memoizeFib(3));
	}
	
	@Test
	public void testFibonacci_memoizeFib4() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 4 should return 3",3, fib.memoizeFib(4));
	}
	
	@Test
	public void testFibonacci_memoizeFib24() throws Exception {
		Fibonacci fib = new Fibonacci();
		assertEquals("nth value of 24 should return 46368",46368, fib.memoizeFib(24));
	}
}

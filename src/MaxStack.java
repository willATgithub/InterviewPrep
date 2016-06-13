import java.util.Stack;

public class MaxStack {
	Stack<Integer> stack;
	Stack<Integer> max;
	
	public MaxStack () {
		stack = new Stack<Integer>();
		max = new Stack<Integer>();
	}
	
	public Integer push(Integer value) {
		if (stack.isEmpty()) {
			max.push(value);
		} else if (value > max.peek()) {
			max.push(value);
		}
				
		return stack.push(value);
	}
	
	public Integer pop() {
		Integer retval = stack.pop();
		if (retval == max.peek()) {
			max.pop();
		}
		return retval;
	}
	
	public Integer peek() {
		return stack.peek();
	}
	
	public Integer search(Integer value){
		return stack.search(value);
	}
	
	public Integer getMax(){
		return max.peek();	
	}

}

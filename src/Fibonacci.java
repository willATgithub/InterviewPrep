import java.util.ArrayList;

public class Fibonacci {
	public int naiveFib(int nth) {
		if (nth == 0) return 0;
		if (nth == 1) return 1;
		return naiveFib(nth-1) + naiveFib(nth-2);
	}
	
	public int memoizeFib(int nth) {
		ArrayList<Integer> memo = new ArrayList<Integer>();
		for (int i = 0; i <= nth; i++) {
			if (i == 0 ) {
				memo.add(i, Integer.valueOf(0));
			}
			else if (i == 1 ) {
				memo.add(i, Integer.valueOf(1));
			}
			else {
				memo.add(i, (memo.get(i-1) + memo.get(i-2)) );
			}
		}
		return (int) memo.get(nth);
	}
}

package practiceassignment01;

public class FibonacciRecursive implements Fibonacci {

	@Override
	public int fibonacci(int n) {
		if (n<=2) {
			return 1;
		}
		return fibonacci(n-2)+fibonacci(n-1);
	}

}

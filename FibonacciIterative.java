package practiceassignment01;

public class FibonacciIterative implements Fibonacci {

	@Override
	public int fibonacci(int n) {
		int temp1 =1;
		int counter = 2;
		int total = 1;
		if (n>2) {
			while (counter<n) {
				int temp2 = total;
				total+=temp1;
				temp1=temp2;
				counter++;
			}
		}
	
		return total;
	}

}

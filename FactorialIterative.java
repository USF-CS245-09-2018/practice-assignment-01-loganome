package practiceassignment01;

public class FactorialIterative implements Factorial {

	@Override
	public int factorial(int n) {
		int total= 1;
		for(int i =n; i>1; i--) {
			total*=i;
		}
		return total;
	}

}

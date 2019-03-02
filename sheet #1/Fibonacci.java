
public class Fibonacci {
	long fibo(int x) {
		long  fib1=0;
		long fib2=1;
		if(x==1) {
			return 0;
		}
		else if(x==2) {
			return 1;
		}
		else {
			for(int i=2;i<x;i++) {
				long swap = fib2;
				fib2 =fib2+fib1;
				fib1 = swap;
				
			}
			return fib2;
		}
		
	}
}

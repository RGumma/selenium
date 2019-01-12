
public class Factorial {

	public long factorial(long n) {

		long j = 1;
		for (long i=n; i>=1; i--) {

			j = i*j;
		}

		return j;
	}
	
	public long combinations(long n, long r){
		
		long j=1;
		
		//TODO Formula is n!/(r!*(n-r)!)
		
		return j;
	}
}

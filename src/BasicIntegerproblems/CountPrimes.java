package BasicIntegerproblems;

import java.util.Arrays;

public class CountPrimes {
	public static int countPrimes(int n) {
		//sieve of erasthosis
		if(n==0) {
			return 0;
		}
		
		boolean sieve_array[]=new boolean[n+1];
		Arrays.fill(sieve_array,true);
		//set 0 and 1 to not primes
		sieve_array[0]=false;
		sieve_array[1]=false;
		for(int i=2;i<=Math.ceil(Math.sqrt(n));i++) {
			if(sieve_array[i]) {
				//if prime then all multiples will be made false;
				for(int j=2;i*j<=n;j++) {
					sieve_array[i*j]=false;
				}
			}
		}
		int count=0;
		for(int i=2;i<=n;i++) {
			if(sieve_array[i]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(10));
	}

}

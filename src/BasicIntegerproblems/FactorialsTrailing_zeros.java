package BasicIntegerproblems;

public class FactorialsTrailing_zeros {
	
	public static int trailingZeroes(int n)
	{
		//Number of five determines the number of zeros so will find how many times our
		//number can be divided by five 2*5 =10 1-5-0 2*10*10=200 2 5 2 zeros
		int counter=0;
		while(n>0)
		{
			n=n/5; //12/5=2 -->counter=2==>2/5=0=>counter=2+0
			counter=counter+n;
		}
		return counter;
	}
	public static void main(String[] args)
	{
		System.out.println(trailingZeroes(12));
	}

}

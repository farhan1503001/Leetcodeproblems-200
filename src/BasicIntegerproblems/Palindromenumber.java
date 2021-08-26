package BasicIntegerproblems;

public class Palindromenumber {
	public static boolean isPalindrome(int n)
	{
		//ignore negative number
		if(n<=0 ||(n%10==0 && n!=0))
		{
			return false;
		}
		int reversed_num=0;
		int temp=n;
		while(temp>0)
		{
			reversed_num=reversed_num*10+(temp%10);
			temp=temp/10;
			
		}
		System.out.println(reversed_num);
		return n==reversed_num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=isPalindrome(121);
		System.out.println(result);
	}

}

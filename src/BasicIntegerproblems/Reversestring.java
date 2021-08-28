package BasicIntegerproblems;

public class Reversestring {
	public static void reverseString(char[] s) {
		int start=0;
		int end=s.length-1;
		while(start<end)
		{
			char temp=s[end];
			s[end]=s[start];
			s[start]=temp;
			start++;
			end--;
		}
		for(char c:s) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hello";
		reverseString(name.toCharArray());
		
		
	}

}

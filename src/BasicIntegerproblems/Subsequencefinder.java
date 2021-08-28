package BasicIntegerproblems;

public class Subsequencefinder {
	public static boolean isSubsequence(String s,String t) {
		if(s.isEmpty())
		{
			return true;
		}
		int comparator=0;
		int iterator=0;
		int size=t.length();
		while(iterator<size) {
			if(s.charAt(comparator)==s.charAt(iterator))
			{
				System.out.println(s.charAt(comparator)+"  "+s.charAt(iterator));
				comparator++;
				if(comparator==s.length())
					break;
			}
			iterator++;
		}
		return comparator==s.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc","ahbgdc"));
	}

}

package BasicIntegerproblems;

public class Validpalindrome {
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		//will ignore anything other than digit/alphabet
		boolean palindrome_status=true;
		while(i<=j)
		{
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			else if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			else {
				if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
				{
					palindrome_status=false;
					break;
				}
				else {
					i++;
					j--;
				}
			}
		}
		return palindrome_status;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}

}

package BasicIntegerproblems;

public class LengthofLastword {
	public static int lengthOfLastWord(String s) {
		int len=s.length();
		int count=0;
		for(int i=len-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			else {
				if(count>0) {
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

	}

}

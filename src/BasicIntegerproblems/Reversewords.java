package BasicIntegerproblems;
public class Reversewords {
	public static String reverseword(String s) {
		s=s.strip();
		int end=s.length()-1;
		StringBuilder newstring=new StringBuilder("");
		int j=end;
		
		while(j>=0) {
			if(s.charAt(j)!=' ') {
				j--;
			}
			else {
				String val=s.substring(j+1, end+1);
			
				if(!val.isBlank()) {
					newstring.append(val);
					//System.out.print(val);
					newstring.append(" ");
					
				}	
				j--;
				end=j;
			}
		}
		String finall=s.substring(0,end+1).strip();
		//System.out.print(finall);
		newstring.append(finall);
		//System.out.println();
		System.out.println(newstring.toString());
		return newstring.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseword("My name is lakkhan");
		reverseword("  hello world  ");
		reverseword("a good   example");

	}

}

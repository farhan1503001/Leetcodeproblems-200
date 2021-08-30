package Stringbased;

import java.util.Arrays;

public class ValidAnagramFind {
	public static boolean validAnagram(String s,String t) {
		int dictionary[]=new int[26];
		Arrays.fill(dictionary,0);
		if(s.length()!=t.length()) {
			return false;
		}
		for(char val:s.toCharArray()) {
			dictionary[(int)val-(int)'a']++;
			//System.out.println((int)val-(int)'a');
			//System.out.println()
			//System.out.print();
		}
		for(char val2:t.toCharArray()) {
			dictionary[(int)val2-(int)'a']--;
			//System.out.println((int)val2-(int)'a');
		}
		
		for(int val:dictionary) {
			//System.out.println(val);
			if(val!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validAnagram("anagram","nagaram"));
		System.out.println(validAnagram("rat","car"));
		
	}

}

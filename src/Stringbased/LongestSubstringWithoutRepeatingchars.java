package Stringbased;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingchars {
	public static int lengthOfLongestSubstring(String s) {
		int maxlen=0;
		int start_index=0;
		HashMap<Character,Integer>dict=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(dict.containsKey(s.charAt(i))) {
				start_index=Math.max(start_index,dict.get(s.charAt(start_index))+1);
			}
			
			maxlen=Math.max(maxlen,i-start_index+1);
			dict.put(s.charAt(i),i);
		}
		System.out.println(maxlen);
		return maxlen;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
	}
}

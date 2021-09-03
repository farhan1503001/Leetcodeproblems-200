package Stringbased;
import java.util.*;
public class WordBreak {
	public static boolean wordBreak(String s,List<String>wordDict) {
		/*
		 * String s: is a word for examination
		 * List<Sting> wordlist
		 * will use literally brute force to check appearence of
		 *  dictionary stream all are lower case so no problem regarding that
		 */
		//creating a dynamic array
		boolean dp[]=new boolean[s.length()+1];
		//now for dealing repeated appearance issues make it a set
		HashSet<String>word_set=new HashSet<>();
		//setting the words in them
		wordDict.forEach(word->word_set.add(word));
		dp[0]=true;
		//Running iteration through word-dp
		for(int i=1;i<=s.length();i++) {
			//inner loop will create substring which we will match
			//example leetcode i=2 j=1 et j:i
			for(int j=0;j<i;j++) {
				System.out.println(s.substring(j,i));
				if(dp[j]==true && word_set.contains(s.substring(j, i))) {
					dp[i]=true;
					System.out.println("Foud String: "+s.substring(j, i));
					break;
				}
				
			}
			
		}
		System.out.println();
		return dp[s.length()];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>words=new ArrayList<>();
		words.add("leet");
		words.add("code");
		System.out.println(wordBreak("leetcode",words));
		words.clear();
	}

}

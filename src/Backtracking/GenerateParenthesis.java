package Backtracking;

import java.util.*;

public class GenerateParenthesis {
	public static void backtrack(List<String>ans,String text,int open,int close,int max) {
		//here open denotes number of open brackets ,close same close brackets
		//max will determine length of text, answer list hold answers
		//backtrack when string size is less, 2 max for equal number of opening and closing brackets
		if(text.length()==2*max) {
			ans.add(text);
			return;
		}
		//till open brackets are greater continue
		if(open<max) {
			backtrack(ans, text+"(", open+1, close, max);
		}
		//we will just balance out opening with close one
		if(close<open) {
			backtrack(ans, text+")", open, close+1, max);
		}
		
	}
	public static List<String> generateParenthesis(int n){
		//here n is the number of parenthesis
		//we will use backtracking algorithm to create a tree to find parenthesis
		List<String> answers=new ArrayList<>();
		//using another function to rgenerate 
		backtrack(answers,"",0,0,n);
		return answers;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>ans=new ArrayList<>();
		ans=generateParenthesis(3);
		for(String key:ans) {
			System.out.println(key);
		}

	}

}

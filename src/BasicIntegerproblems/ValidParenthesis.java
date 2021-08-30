package BasicIntegerproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		if(s.isEmpty()) {
			return true;
		}
		if(s.length()<=1) {
			return false;
		}
		//Setting up hashmap of closing brackets
		HashMap<Character,Character>closing_brackets=new HashMap<>();
		closing_brackets.put(')', '(');
		closing_brackets.put('}', '{');
		closing_brackets.put(']', '[');
		Stack<Character>bracket_stack=new Stack<>();
		//now iterate over the string
		boolean result=true;
		for(char c:s.toCharArray()) {
			//if we find closing brackets
			if(closing_brackets.containsKey(c)) {
				//check top of stack
				if(!bracket_stack.isEmpty()) {
				char comp=bracket_stack.pop();
				if(comp!=closing_brackets.get(c)) {
					return false;
				}
				}
				else {
					return false;
				}
			}
			else {
				//not closing then send it to stack
				bracket_stack.push(c);
			}
		}
		return bracket_stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("){"));

	}

}

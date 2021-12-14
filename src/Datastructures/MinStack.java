package Datastructures;
import java.util.*;
class stacknode{
	public int value;
	public int min_val;
	public stacknode(int value,int min_value) {
		this.value=value;
		this.min_val=min_value;
	}
}
public class MinStack{
	private Stack<stacknode>stack;
	public MinStack() {
		this.stack=new Stack<>();
	}
	public int getmin() {
		return stack.peek().min_val;
	}
	public void push(int val) {
		if(this.stack.isEmpty()) {
			stack.add(new stacknode(val, val));
		}
		else {
			int min=getmin();
			if(min<val) {
				stack.add(new stacknode(val,val));
			}
			else {
				stack.add(new stacknode(val, min));
			}
		}
	}
	public void pop() {
		if(!stack.isEmpty()) {
			stack.pop();
		}
	}
	public int top() {
		return stack.peek().value;
	}
}

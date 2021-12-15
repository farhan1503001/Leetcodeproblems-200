package Backtracking;
import java.util.*;
public class CombinationSum3 {
	public static void backtrack(int remain,int size,LinkedList<Integer>currents,int nextstart,List<List<Integer>>results)
	{
		if(remain==0 && currents.size()==size) {
			results.add(new ArrayList<>(currents));
			return;
		}
		if(remain<0 || currents.size()==size) {
			return;
		}
		for(int index=nextstart;index<9;index++)
		{
			currents.add(index+1);
			backtrack(remain-index-1, size, currents,index+1, results);
			currents.removeLast();
		}
	}
	
	
	public static List<List<Integer>> combinationSum3(int k,int n){
		LinkedList<Integer>combination=new LinkedList<>();
		List<List<Integer>>results=new ArrayList<List<Integer>>();
		backtrack(n,k,combination,0, results);
		return results;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

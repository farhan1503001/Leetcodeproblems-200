package Backtracking;
import java.util.*;
public class CombinationSum {
	public static void backtrack(int remain,LinkedList<Integer>currents,int[] candidates,int start,List<List<Integer>>results) {
		if(remain==0) {
			results.add(new ArrayList<Integer>(currents));
			return;
		}
		else if(remain<0) {
			return;
		}
		for(int i=start;i<candidates.length;i++) {
			currents.add(candidates[i]);
			backtrack(remain-candidates[i], currents, candidates, start, results);
			currents.removeLast();
		}
	}
	public static List<List<Integer>> combinationSum(int[] array,int target){
		LinkedList<Integer>currents=new LinkedList();
		List<List<Integer>>results=new ArrayList<List<Integer>>();
		backtrack(target, currents, array, target, results);
		return results;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

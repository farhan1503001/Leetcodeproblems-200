package Backtracking;

import java.util.*;
public class Subsets {
	List<List<Integer>>answer=new ArrayList<List<Integer>>();
	public void backtrack(int first,List<Integer>combination,int[] nums,int len) {
		if(combination.size()>len) {
			return;
		}
		if(combination.size()==len) {
			answer.add(combination);
			return;
		}
		for(int i=first;i<nums.length;i++)
		{
			combination.add(nums[i]);
			this.backtrack(i+1, combination, nums, len);
			combination.remove(combination.size()-1);
		}
	}
	public List<List<Integer>> subsets(int[] nums){
		//proti size er jonno ghorabo mainly size dhorar array
		for(int length=0;length<=nums.length;length++) {
			List<Integer>combination=new ArrayList<>();
			backtrack(0,combination,nums,length);
		}
		return answer;
	}
}

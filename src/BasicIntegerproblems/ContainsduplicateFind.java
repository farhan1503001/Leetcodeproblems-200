package BasicIntegerproblems;

import java.util.HashMap;

public class ContainsduplicateFind {
	public static boolean containsDuplicate(int nums[]) {
		if(nums.length==1) {
			return false;
		}
		HashMap<Integer,Integer>memory=new HashMap<>();
		for(int val:nums) {
			if(!memory.containsKey(val)) {
				memory.put(val,1);
			}
			else {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}

}

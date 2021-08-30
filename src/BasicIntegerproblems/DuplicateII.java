package BasicIntegerproblems;

import java.util.HashMap;

public class DuplicateII {
	public static boolean nearbyDuplicates(int nums[],int k) {
		HashMap<Integer,Integer>memory=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!memory.containsKey(nums[i])) {
				memory.put(nums[i],i);
			}
			else {
				if(Math.abs(memory.get(nums[i])-i)<=k) {
					return true;
				}
				else {
					memory.put(nums[i],i);
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,2,3};
		System.out.println(nearbyDuplicates(arr, 2));

	}

}

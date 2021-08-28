package BasicIntegerproblems;

import java.util.HashMap;

public class MajorityElementFind {
	public static int majorityElement(int nums[]) {
		HashMap<Integer,Integer>memory=new HashMap<>();
		int condition=(int)(nums.length/2);
		for(int i=0;i<nums.length;i++)
		{
			if(!memory.containsKey(nums[i])) {
				memory.put(nums[i],1);
			}
			else {
				memory.put(nums[i],memory.get(nums[i])+1);
				if(memory.get(nums[i])>condition) {
					return nums[i];
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}

}

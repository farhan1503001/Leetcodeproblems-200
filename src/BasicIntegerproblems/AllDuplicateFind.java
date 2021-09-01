package BasicIntegerproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllDuplicateFind {
	public static List<Integer> findDuplicates(int nums[]){
		List<Integer>duplicates=new ArrayList<>();
		HashMap<Integer,Boolean>memory=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!memory.containsKey(nums[i])) {
				memory.put(nums[i],true);
			}
			else {
				if(memory.get(nums[i])) {
					duplicates.add(nums[i]);
					memory.put(nums[i],false);
				}
			}
		}
		duplicates.forEach(item->System.out.print(item));
		return duplicates;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer>result=new ArrayList<>();
		result=findDuplicates(nums);
		result.forEach(item->System.out.print(item+" "));
		
	}

}

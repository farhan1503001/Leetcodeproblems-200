package BasicIntegerproblems;
import java.util.*;
public class FindDisappearedNumbers {
	public static List<Integer> findDisappearedNumber(int nums[]){
		List<Integer>list=new ArrayList<>();
		//each item refers also to a index so what will do is something like flag every
		//index with value, negative means visited positive means not
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+"  "+nums[i]+" ");
			int employ=Math.abs(nums[i]);//for duplicates 1 will be -1 then -1 so make 1
			if(nums[employ-1]>0) {
				nums[employ-1]*=-1; //make it negative
			}
		}
		//now iterate and check which index is not visited
		System.out.println();
		for(int index=0;index<nums.length;index++) {
			//if anyone not visited
			System.out.print(nums[index]+" ");
			if(nums[index]>0) {
				//we will append it to list adding 1
				//as index starts from 1
				list.add(index+1);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer>result=findDisappearedNumber(nums);
		result.forEach(item->System.out.println(item));

	}

}

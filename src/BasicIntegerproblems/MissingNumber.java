package BasicIntegerproblems;

public class MissingNumber {
	public static int missingNumber(int nums[]) {
		int found_sum=0;
		for(int val:nums) {
			found_sum+=val;
		}
		int actual_sum=((nums.length)*(nums.length+1))/2;
		return actual_sum-found_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,0,1};
		System.out.println(missingNumber(nums));
	}

}

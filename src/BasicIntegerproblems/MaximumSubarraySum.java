package BasicIntegerproblems;

public class MaximumSubarraySum {
	public static int maxSubArray(int nums[]) {
		int current_sum=nums[0];
		int max_sum=nums[0];
		for(int i=1;i<nums.length;i++) {
			int temp=current_sum+nums[i];
			if(temp>nums[i]) {
				current_sum=temp;
			}
			else {
				current_sum=nums[i];
			}
			//updating maximum size
			max_sum=Math.max(max_sum,current_sum);
			
		}
		return max_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

}

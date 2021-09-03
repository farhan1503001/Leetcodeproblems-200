package BasicIntegerproblems;

public class SubarrayproductLessthanK {
	public static int numSubarrayProductLessThanK(int[] nums,int k) {
		/*
		 * left stationed and iterate i++>
		 * if product becomes greater means subsequence breaks 
		 * so then move left and create a new subsequence
		 */
		if(k<=1) {
			return 0;
		}
		int left=0;
		int product=1;
		int counter=0; //string numbers are actually combination so 3->3c1=3 4=4c1=4
		for(int i=0;i<nums.length;i++) {
			product=product*nums[i];
			//if product greater than we have to 
			//break down the substring
			while(product>=k) {
				product=product/nums[left];
				left++;
			}
			counter+=(i-left+1);
		}
		System.out.println(counter);
		return counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10,5,2,6};
		System.out.println(numSubarrayProductLessThanK(nums, 100));

	}

}

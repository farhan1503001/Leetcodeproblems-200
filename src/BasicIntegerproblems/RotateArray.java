package BasicIntegerproblems;

public class RotateArray {
	public static void rotate(int nums[],int k) {
		 int len=nums.length;
		 int reverted_array[]=new int[len];
		 //0-3 1-4 size 5-then 0 (index+step)%k
		 for(int i=0;i<len;i++) {
			 reverted_array[(i+k)%len]=nums[i];
		 }
		 for(int i=0;i<len;i++) {
			 nums[i]=reverted_array[i];
		 }
		 for (int val : reverted_array) {
			System.out.print(val+"  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6,7};
		int step=3;
		rotate(nums, step);
	}

}

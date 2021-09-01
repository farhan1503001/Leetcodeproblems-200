package BasicIntegerproblems;

public class MoveZeros {
	public static void moveZeroes(int nums[]) {
		//two iterator problems
		int current=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[current]=nums[i];
				current++;
			}
		}
		//after current fill till length with zeros
		for(int j=current;j<nums.length;j++) {
			nums[j]=0;
		}
		for(int val:nums) {
			System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,0,3,12};
		moveZeroes(nums);

	}

}

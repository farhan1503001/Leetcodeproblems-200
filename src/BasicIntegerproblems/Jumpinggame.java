package BasicIntegerproblems;

public class Jumpinggame {
	public static boolean canJump(int[] nums) {
		int position=nums.length-1;//last element
		int jumper=position-1;
		//iterate until jumper completes full traversal
		boolean is_jumppossible=false;
		while(jumper>=-1) {
			System.out.println(position+"  "+jumper);
			if((position-jumper)<=nums[position] && position!=0)
			{
				position=jumper;
				jumper=position-1;
			}
			else {
				jumper--;
			}
		}
		if(position==0)
			is_jumppossible=true;
		return is_jumppossible;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,1,4};
		int[] arr1= {0,1};
		System.out.println(canJump(arr));
		System.out.println(canJump(arr1));
	}

}

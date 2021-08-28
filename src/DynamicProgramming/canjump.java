package DynamicProgramming;

public class canjump {
	public static boolean isjump(int nums[]) {
		 /*
		  * each index represents a position and array value maximum jump
		  */
		int reached_distance=0;
		boolean can_reach=false;
		for(int i=0;i<nums.length;i++)
		{
			//System.out.println(reached_distance);
			if(reached_distance<i)
			{
				can_reach=false;
				break;
			}
			reached_distance=Math.max(reached_distance, i+nums[i]);
			System.out.println(reached_distance);
			if(reached_distance>=nums.length-1)
			{
				can_reach=true;
				break;
			}
		}
		return can_reach;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,1,4};
		int[] arr1= {0,1};
		System.out.println(isjump(arr));
		System.out.println(isjump(arr1));
	}

}

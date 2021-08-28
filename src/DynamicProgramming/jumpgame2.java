package DynamicProgramming;

public class jumpgame2 {
	public static int minjumps(int nums[]) {
		int m=nums.length;
		int reached_distance=0;
		int highest_index=0;
		int count=0;
		if(m==1)
		{
			return count;
		}
		for(int i=0;i<m-1;i++)
		{
			if(reached_distance<i) {
				break;
			}
			reached_distance=Math.max(reached_distance,i+nums[i]);
			//Logic is to increament when we are at highest index
			if(i==highest_index) {
			count++; 
			highest_index=reached_distance;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,1,4};
		int[] arr1= {1,2,1,1,1};
		System.out.println(minjumps(arr));
		System.out.println(minjumps(arr1));
	}

}

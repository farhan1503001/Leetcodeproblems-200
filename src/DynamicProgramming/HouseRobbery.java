package DynamicProgramming;

public class HouseRobbery {
	public static int rob(int[] nums)
	{
		/*
		 * will use dp. every house has two choices either rob it or pass it
		 * if not rob then before it maximum value will be for this house or previous
		 * house+two house previous amount of money
		 */
		int m=nums.length;
		if(m==0){
			return 0;
		}
		if(m==1) {
			return nums[0];
		}
		int[] dp=new int[m];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[1],dp[0]);
		for(int i=2;i<m;i++)
		{
			dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
		}
		return dp[m-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,9,3,1};
		System.out.println(rob(arr));
	}

}

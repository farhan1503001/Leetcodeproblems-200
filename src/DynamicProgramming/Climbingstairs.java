package DynamicProgramming;

import java.util.Arrays;

public class Climbingstairs {
	public static int climbstairs(int n) {
		int dp[]=new int[n+1];
		Arrays.fill(dp,0);
		//stair 1 -1 way stair 2-0->2 0-1-2
		//stair 3 0->3 0-1-2> 0-2-3
		//so just add previous two
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbstairs(6));
	}

}

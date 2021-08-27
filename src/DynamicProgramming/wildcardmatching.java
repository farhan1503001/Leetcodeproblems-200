package DynamicProgramming;

import java.util.Arrays;

public class wildcardmatching {
	public static boolean isMatch(String s,String p) {
		int m=s.length();
		int n=p.length();
		boolean dp[][]=new boolean[m+1][n+1];
		//System.out.println(dp[0][0]);
		for(int i=0;i<m+1;i++) {
			Arrays.fill(dp[i], false);
		}
		
		dp[0][0]=true;
		//Handeling special case
		for(int j=1;j<n+1;j++)
		{
			if(p.charAt(j-1)=='*') {
			dp[0][j]=dp[0][j-1];
			}
		}
		for(int i=1;i<m+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?')
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if(p.charAt(j-1)=='*')
				{
					dp[i][j]=dp[i-1][j] || dp[i][j-1];
				}
				else {
					dp[i][j]=false;
				}
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("abcdef","a?c*f"));
		System.out.println(isMatch("aa","*"));
	}

}

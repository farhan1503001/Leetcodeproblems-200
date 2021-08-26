package DynamicProgramming;

public class Longestcommonsubsequence {
	public static int lcs(String str1,String str2) {
		//Finding the row and columns for the memory array
		int m=str1.length()+1;
		int n=str2.length()+1;
		int dp[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				dp[i][j]=0;
		}
		int answer=0;
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
				if(answer<dp[i][j])
				{
					answer=dp[i][j];
				}
				
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcs("abcde","ace"));
	}

}

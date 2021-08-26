package DynamicProgramming;

public class EditDistance {
	public static int editDistance(String text1,String text2)
	{
		int m=text1.length();
		int n=text2.length();
		//first string will be rowwise while string2 will be columnwise
		int dp[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			dp[i][0]=i;
		}
		for(int j=0;j<=m;j++)
		{
			dp[0][j]=j;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(text2.charAt(i-1)==text1.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
				}
			}
		}
		return dp[n][m];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(editDistance("abdceg","agcef"));

	}

}

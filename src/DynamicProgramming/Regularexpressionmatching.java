package DynamicProgramming;

public class Regularexpressionmatching {
	public static boolean isMatch(String s,String p)
	{
		//Finding the lengths
		int m=s.length();
		int n=p.length();
		//create a dp array
		boolean dp[][]=new boolean[m+1][n+1];
		dp[0][0]=true;
		//special starter special case
		for(int col=2;col<=n;col++)
		{
			if(p.charAt(col-1)=='*') {
			dp[0][col]=dp[0][col-2];
			}
		}
		//dynamic programming loop
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				//Match found
				if(p.charAt(j-1)=='.'||s.charAt(i-1)==p.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if(p.charAt(j-1)=='*')
				{
					dp[i][j]=dp[i][j-2];
					if(p.charAt(j-2)==s.charAt(i-1)||p.charAt(j-2)=='.')
					{
						dp[i][j]=dp[i][j]||dp[i-1][j];
					}
				}
			}
		}
		return dp[m][n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("axyb","a.*b"));
		System.out.println(isMatch("mississippi","mis*is*ip*."));
	}

}

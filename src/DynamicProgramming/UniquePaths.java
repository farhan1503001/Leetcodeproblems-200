package DynamicProgramming;

public class UniquePaths {
	public static int uniquePath(int m,int n) {
		//m and n are number of rows 
		//create a dynamic array table
		int dp[][]=new int[m][n];
		//robot can move only down so all member of col-0 can be reached 1 ways
		for(int i=0;i<m;i++) {
			dp[i][0]=1;
		}
		//robot can move right so row 1 can be 1 way 
		for(int j=0;j<n;j++) {
			dp[0][j]=1;
		}
		//result will come from adding top and just left
		for(int row=1;row<m;row++) {
			for(int col=1;col<n;col++) {
				dp[row][col]=dp[row-1][col]+dp[row][col-1];
			}
		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePath(3, 7));
	}

}

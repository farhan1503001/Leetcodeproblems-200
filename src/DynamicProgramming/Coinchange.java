package DynamicProgramming;

import java.util.Arrays;

public class Coinchange {
	public static int coinchange(int coins[],int amount) {
		//Money diagram array amount+1 size for accessing amounts
		int dp[]=new int[amount+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0; //Amount of 0 is 0 normal
		//if 10 is amount 1 coin then 9 coin will add 9 coin result
		for(int money=1;money<=amount;money++)
		{
			for(int coin:coins) {
				if(coin<=money) {
					if(dp[money-coin]!=Integer.MAX_VALUE) {
					dp[money]=Math.min(dp[money],dp[money-coin]+1);
					}
				}
			}
		}
		/*
		for(int val:dp) {
			System.out.print(val);
		}
		*/
		return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[]= {1,2,5};
		System.out.println(coinchange(coins,11));
		int arr[]= {2};
		System.out.println(coinchange(arr, 3));
	}

}

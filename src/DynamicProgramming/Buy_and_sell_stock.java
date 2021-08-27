package DynamicProgramming;

public class Buy_and_sell_stock {
	public static int maximum_profit(int[] prices)
	{
		int day1=-1;
		int day2=-2;
		//Minimum buying price
		int buying_price=Integer.MAX_VALUE;
		int profit=0;
		for(int i=0;i<prices.length;i++)
		{
			if(buying_price>prices[i])
			{
				buying_price=prices[i];
				day1=i;
			}
			else {
				if(prices[i]-buying_price>profit)
				{
					profit=prices[i]-buying_price;
					day2=i;
				}
				else {
					continue;
				}
			}
		}
		System.out.println(day1+"  "+day2);
		System.out.println(profit);
		return profit;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4};
		maximum_profit(prices);
	}

}

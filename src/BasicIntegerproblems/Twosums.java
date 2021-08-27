package BasicIntegerproblems;

import java.util.HashMap;

public class Twosums {
	public static int[] twosum(int arr[],int target)
	{
		HashMap<Integer,Integer>account=new HashMap<>();
		int curr[]= new int[2];
		for(int i=0;i<arr.length;i++)
		{
			int temp=target-arr[i];
			//System.out.println(temp);
			if(!account.containsKey(arr[i])) {
				account.put(temp,i);
			}
			else {
				curr[0]=account.get(arr[i]);
				curr[1]=i;
				break;
			}
		}
		//System.out.println();
		/*
		for(int val:account.keySet()) {
			System.out.println(account.get(val));
		}
		return curr;
		*/
		return curr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {2,7,11,15};
		int result[]=twosum(input,9);
		//System.out.println();
		for(int i=0;i<2;i++)
		{
			System.out.println(result[i]);
		}
	}

}

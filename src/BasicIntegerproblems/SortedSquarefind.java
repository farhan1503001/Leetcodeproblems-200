package BasicIntegerproblems;

public class SortedSquarefind {
	public static int[] sortedSquares(int nums[])
	{
		int size=nums.length;
		int start=0;
		int end=size-1;
		int[] result=new int[size];
		int last=end;
		while(start<=end) {
			int sq_start=nums[start]*nums[start];
			int sq_end=nums[end]*nums[end];
			if(sq_start>=sq_end) {
				result[last]=sq_start;
				last--;
				start++;
			}
			else {
				result[last]=sq_end;
				last--;
				end--;
			}
		}
		System.out.println();
		for(int val:result) {
			System.out.print(val+" ");
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-7,-3,2,3,11};
		sortedSquares(arr);
	}

}

package BasicIntegerproblems;

public class SearchInsertPosition {
	public static void searchPosition(int nums[],int target) {
		int start=0;
		int end=nums.length-1;
		int mid=0;
		while(start<=end) {
			System.out.println(start+"  "+end);
			mid=(start+end)/2;
			if(nums[mid]==target) {
				break;
			}
			else if(nums[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		//System.out.println(start+"  "+mid+"  "+end);
		System.out.println(start);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,5,6};
		searchPosition(nums,0);

	}

}

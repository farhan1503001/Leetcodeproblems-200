package sorting;

public class Binary_search {
	public static int search(int nums[],int target) {
		int low=0;
		int high=nums.length-1;
		int mid=-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(target>nums[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,4,6,7};
		System.out.println(search(nums,4));

	}

}

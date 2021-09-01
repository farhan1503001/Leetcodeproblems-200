package BasicIntegerproblems;

public class FirstLastpositionofsortedArray {
	public static int[] searchRange(int nums[],int target) {
		int low=0;
		int high=nums.length-1;
		boolean flag=false;
		int position[]=new int[2];
		int leftposition=-1;
		while(low<=high) {
			int mid=(int)(low+high)/2;
			//finding the leftmost appearence
			if(nums[mid]==target &&(mid==0||nums[mid-1]<target)) {
				flag=true;
				leftposition=mid;
				break;
			}
			//from right to left to high must best decreased
			//12222(mid)333
			//1-<<<
			else if(nums[mid]>=target) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		if(flag==false) {
			position[0]=-1;
			position[1]=-1;
			return position;
		}
		position[0]=leftposition;
		low=leftposition+1;
		high=nums.length-1;
		//from left if same low=low+1 low increase
		int rightposition=-1;
		while(low<=high) {
			int mid=(int)(low+high)/2;
			if(nums[mid]==target && (mid==(nums.length-1)||nums[mid+1]>target)) {
				rightposition=mid;
				break;
			}
			//12(mid)-->223
			else if(nums[mid]<=target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(rightposition==-1) {
			rightposition=leftposition;
		}
		position[1]=rightposition;
		return position;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,7,8,8,10};//3-0->(3+0+1)=4
		int result[]=new int[2];
		result=searchRange(arr,8);
		for(int val:result) {
			System.out.print(val+"  ");
		}
		int arr1[]= {1,4};
		result=searchRange(arr1,4);
		for(int val:result) {
			System.out.print(val+" ");
		}
	}

}

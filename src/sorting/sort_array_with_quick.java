package sorting;

public class sort_array_with_quick {
	public static int[] sortArray(int nums[]) {
		quicksort(nums,0,nums.length-1);
		return nums;
	}
	public static void quicksort(int nums[],int start,int end) {
		if(start<end) {
			int mid=partision(nums,start,end);
			quicksort(nums,start,mid-1);
			quicksort(nums,mid+1,end);
		}
	}
	public static int partision(int nums[],int start,int end) {
		int sorting_index=start-1;
		int current_index=start;
		int pivot_value=nums[end];
		while(current_index<=end) {
			//ascending order so left will be smaller 
			//System.out.println(nums[current_index]+"  "+nums[sorting_index]);
			if(nums[current_index]<=pivot_value) {
				sorting_index++;
				int temp=nums[current_index];
				nums[current_index]=nums[sorting_index];
				nums[sorting_index]=temp;
				
			}
			current_index++;
		}
		return sorting_index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,1,1,2,0,0};
		int res[]=sortArray(nums);
		for(int val:res) {
			System.out.print(val+"   ");
		}
	}

}

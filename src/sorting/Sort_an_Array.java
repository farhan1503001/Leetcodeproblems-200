package sorting;

public class Sort_an_Array {
	public static int[] sortArray(int nums[]) {
		
		mergeSort(nums, 0,nums.length-1);
		return nums;
	}
	public static void mergeSort(int nums[],int start,int end) {
		//will divide until 1 elements in array
		if(start>=end) {
			return;
		}
		int mid=(int)(start+end)/2;
		mergeSort(nums, start,mid);
		mergeSort(nums,mid+1, end);
		merge(nums,start,mid,end);
	}
	public static void merge(int nums[],int start,int mid,int end) {
		int temp[]=new int[end-start+1];
		int left=start;
		int right=mid+1;
		int i=0;
		while(left<=mid && right<=end) {
			if(nums[left]<=nums[right]) {
				temp[i]=nums[left];
				left++;
				i++;
			}
			else {
				temp[i]=nums[right];
				right++;
				i++;
			}
		}
		if(left<=mid) {
			while(left<=mid) {
				temp[i]=nums[left];
				left++;
				i++;
			}
		}
		else if(right<=end) {
			while(right<=end) {
				temp[i]=nums[right];
				right++;
				i++;
			}
		}
		for(int j=0;j<temp.length;j++) {
			nums[start+j]=temp[j];
		}
		for (int val : nums) {
			System.out.print(val+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,1,2,0,0};
		int res[]=sortArray(arr);
		for (int val : res) {
			System.out.println(val);
		}

	}

}

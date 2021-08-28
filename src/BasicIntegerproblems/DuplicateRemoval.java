package BasicIntegerproblems;

public class DuplicateRemoval {
	public static int removeDuplicates(int nums[]) {
		//we need two pointers when values are equal will not do it when unequal then swap
		if(nums.length==0) {
			return 0;
		}
		int start=0;
		int end=1;
		while(end!=nums.length) {
			System.out.println(start+" "+end);
			if(nums[start]==nums[end]) {
				end++;
			}
			else {
				start++;
				nums[start]=nums[end];
				end++;
			}
		}
		System.out.println();
		for(int i=0;i<=start;i++)
		{
			System.out.print(nums[i]);
		}
		return start+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}

}

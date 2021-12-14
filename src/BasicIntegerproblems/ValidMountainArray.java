package BasicIntegerproblems;

public class ValidMountainArray {
	public static boolean validMountainArray(int arr[]) {
		if(arr.length<3) {
			return false;
		}
		int count=0;
		//increase then decrease 
		while(count<arr.length && arr[count]<arr[count+1]) {
			count++;
		}
		System.out.println(count);
		if(count==0||count==arr.length-1) {
			return false;
		}
		while(count<arr.length-1 && arr[count]>arr[count+1]) {
			count++;
		}
		return count==arr.length-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,3,4,5,2,1,0};
		System.out.println(validMountainArray(arr));

	}

}

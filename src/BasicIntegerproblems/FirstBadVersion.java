package BasicIntegerproblems;

public class FirstBadVersion {
	public static boolean isBadVersion(int version) {
		return version>=4;
	}
	public static int firstBadVersion(int n) {
		int start=0;
		int end=n;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(!isBadVersion(mid)) {
				//if not left is not required to be searched
				start=mid+1;
			}
			else {
				//if found try to find first one by searching left
				end=mid;
			}
		}
		return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstBadVersion(5));
	}

}

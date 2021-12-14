package BasicIntegerproblems;
//we will use fibonacci sequence
public class Climbingstairs {
	public static int climbStairs(int n) {
		//if only single stair
		if(n==1) {
			return 1;
		}
		int first=1;
		int second=2;
		//purborbiti dui stair asle ek dhape final e jaoa jai
		for(int i=3;i<=n;i++) {
			int temp=first+second;
			first=second;
			second=temp;
		}
		return second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=climbStairs(5);
		System.out.println(result);
	}

}

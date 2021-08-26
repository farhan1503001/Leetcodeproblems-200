package BasicIntegerproblems;
import java.util.*;
public class Reversenumber {
	public static int reverse_num(int number) {
		long n=number<0?number*-1:number;
		boolean flag=number<0? true: false;
		long rev=0;
		while(n>0) {
			rev=rev*10+(n%10);
			n=n/10;
		}
		if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
			return 0;
		else {
		return flag==true?(int)rev*-1:(int)rev;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev_num=reverse_num(n);
		System.out.println(rev_num);

	}

}

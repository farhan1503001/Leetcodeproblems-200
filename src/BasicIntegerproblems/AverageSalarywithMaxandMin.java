package BasicIntegerproblems;

public class AverageSalarywithMaxandMin {
	public static double average(int[] salary) {
		/*
		 * will find max and min and without them calculate sum and avg
		 */
		int max_num=Integer.MIN_VALUE;
		int min_num=Integer.MAX_VALUE;
		for(int i=0;i<salary.length;i++) {
			if(max_num<salary[i]) {
				max_num=salary[i];
			}
			if(min_num>salary[i]) {
				min_num=salary[i];
			}
		}
		//System.out.println(max_num+"   "+min_num);
		int sum=0;
		for(int i=0;i<salary.length;i++) {
			if(salary[i]!=max_num && salary[i]!=min_num) {
				sum+=salary[i];
			}
		}
		return (double)sum/(salary.length-2);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] salary= {8000,9000,2000,3000,6000,1000};
		System.out.println(average(salary));

	}

}

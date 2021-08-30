package BasicIntegerproblems;

import java.util.HashMap;

public class FoursumII {
	public static int foursumcount(int num1[],int num2[],int num3[],int num4[]) {
		//will count (u+v) then will try to find -(u+v)
		HashMap<Integer,Integer>memory=new HashMap<>();
		//find combination for first two arrays
		for(int u:num1) {
			for(int v:num2) {
				int target=u+v;
				if(!memory.containsKey(target)) {
					memory.put(target,1);
				}
				else {
					memory.put(target,memory.get(target)+1);
				}
			}
		}
		//now find negative combination for 3 and 4
		int counter=0;
		for(int x:num3) {
			for(int y:num4) {
				int target=-(x+y);
				if(memory.containsKey(target)) {
					counter+=memory.get(target);
				}
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {-1,1};
		int arr2[]= {1,-1};
		int arr3[]= {-2,2};
		int arr4[]= {2,-2};
		System.out.println(foursumcount(arr1, arr2, arr3, arr4));

	}

}

package BasicIntegerproblems;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void merge(int nums1[],int m,int nums2[],int n) {
		/*
		 * make them index then 
		 */
		if(n==0) {
			return;
		}
		int point1=m-1;
		int point2=n-1;
		int index=nums1.length-1;
		while(point1>=0 && point2>=0) {
			if(nums1[point1]>nums2[point2]) {
				nums1[index]=nums1[point1];
				point1-=1;
			}
			else {
				nums1[index]=nums2[point2];
				point2-=1;
			}
			index-=1;
		}
		if(point2>=0) {
		while(point2>=0) {
			nums1[index]=nums2[point2];
			point2-=1;
			index-=1;
		}
		}
		for(int val:nums1) {
			System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,0};
		int m=1;
		int arr2[]= {2};
		int n=1;
		merge(arr1, m, arr2, n);
		for(int val:arr1) {
			System.out.println(val);}
		}


}

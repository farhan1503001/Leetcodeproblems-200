package Stringbased;
import java.util.*;
public class Sequentialdigits {
	public static List<Integer> sequentialDigits(int low,int high){
		String digits="123456789";
		List<Integer>result=new ArrayList<>();
		//iterate over size
		for(int size=1;size<=digits.length();size++) {
			//starting index of substrings
			for(int i=0;i<=digits.length()-size;i++) {
				//create the substring
				String sub=digits.substring(i, i+size);
				//convert that to int
				Integer val=Integer.parseInt(sub);
				if(val>=low && val<=high) {
					result.add(val);
					//add it to array
				}
				
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sequentialDigits(10,100000).forEach(val->System.out.println(val));
	}

}

package Stringbased;
import java.util.*;
public class GroupAnagrams {
	public static List<List<String>> groupAnagram(String[] strs) {
		List<List<String>> result=new ArrayList<List<String>>();
		int size=strs.length;
		HashMap<String,List<String>>memory=new HashMap<>();
		for(int i=0;i<size;i++)
		{
			char[] val=strs[i].toCharArray();
			List<String>temp=new ArrayList<String>();
			Arrays.sort(val);
			//System.out.println(val);
			String key=String.valueOf(val);
			//System.out.print(key);
			if(!memory.containsKey(key)) {
				memory.put(key,temp);//Empty list insertion
			}
			temp=memory.get(key);//List found
			temp.add(key);//new string added
			memory.put(key,temp);//list is sent back
		}
		memory.values().forEach(value->result.add(value));
		for(List<String>item:result) {
			for(String val:item) {
				System.out.print(val+"  ");
			}
			System.out.println();
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		groupAnagram(strs);
	}

}

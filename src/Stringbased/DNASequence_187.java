package Stringbased;
import java.util.*;
public class DNASequence_187 {
	public static List<String> findrepeatedsequence(String s){
		//creating the hashmap
		HashMap<String,Integer>sequence_store=new HashMap<>();
		List<String> repeat_sequence=new ArrayList<>();
		//iterating through the array
		for(int i=0;i<=s.length()-10;i++) {
			String sub_string=s.substring(i,i+10);
			sequence_store.put(sub_string,sequence_store.getOrDefault(sub_string,0)+1);
		}
		//after all is found then iterate and select out 
		for(String key:sequence_store.keySet()) {
			if(sequence_store.get(key)>1) {
				repeat_sequence.add(key);
				System.out.println(key);
			}
		}
		return repeat_sequence;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First taking input
		Scanner sc=new Scanner(System.in);
		findrepeatedsequence(sc.nextLine());
		
	}

}

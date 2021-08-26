package BasicIntegerproblems;
import java.util.*;
public class Fizzbuzz {
    public  static List<String> fizzBuzz(int n)
    {
    	List<String>num_store=new ArrayList<String>();
    	for(int i=1;i<=n;i++)
    	{
    		StringBuilder arbitary=new StringBuilder("");
    		if(i%3==0)
    		{
    			arbitary.append("Fizz");
    		}
    		if(i%5==0)
    		{
    			arbitary.append("Buzz");
    		}
    		if(arbitary.toString().equals(""))
    		{
    			num_store.add(Integer.toString(i));
    		}
    		else {
    			num_store.add(arbitary.toString());
    		}
    	}
    	return num_store;
    }
    public static void main(String[] args)
    {
    	List result=fizzBuzz(15);
    	result.forEach(item->System.out.print(item));
    }
}

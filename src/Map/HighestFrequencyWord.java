package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class HighestFrequencyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are using TreeSet for sorting
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		String str="I am an IT employee I love IT ";
		
		String s[]=str.split(" ");
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		for(String x:s) {
			if(mp.containsKey(x)) {
				mp.put(x, mp.get(x)+1);
			}
			
			else {
				mp.put(x, 1);
			}
		}
//		System.out.println(mp);  {love=1, I=1, IT=1, am=1, employee=1, an=1}
		for(Map.Entry<String, Integer> me:mp.entrySet()) {
			t.add(me.getValue());  //here this treeset will sort the values in ascending order
		}
		
		for(Map.Entry<String, Integer> me:mp.entrySet()) {
			if(me.getValue()==t.last()) {
				System.out.println(me.getKey() +" " +me.getValue());
			}
		}
		
		
		

	}

}

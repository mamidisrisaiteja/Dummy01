package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class HighestFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		String str="I am in Interview";
		
		String s=str.toLowerCase().replaceAll(" ", "");
		
	//	System.out.println(s);
		
		char c[]=s.toCharArray();
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(char ch:c) {
			if(mp.containsKey(ch)) {
				mp.put(ch,mp.get(ch)+1);
			}
			else {
				mp.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer>  me:mp.entrySet()) {
			ts.add(me.getValue());
		}
		
		for(Map.Entry<Character, Integer> me:mp.entrySet()) {
			if(me.getValue()==ts.last()) {
				System.out.println(me.getKey() +" "+me.getValue());
			}
		}
		

	}

}

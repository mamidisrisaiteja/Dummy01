package Map;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacters {

	public static void main(String[] args) {
		
		int i=0;
		String str="I am in India and Rome and I love India";
		char[] ch=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			
		
		else 
			mp.put(c,1);
		}
		
		for(Map.Entry<Character, Integer> me : mp.entrySet()) {
			if(me.getValue()==1) {  //this is used for if the value is equals to 1 then we will get the key
				//related to that 
				System.out.println(me.getKey());
			}
		}
		
		
		
	}

}

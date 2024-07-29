package Map;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyofWordinString {

	public static void main(String[] args) {
	    
		 String s1="I am an IT employee I love IT";
		 String s2[]=s1.split(" ");
//		 for(int i=0;i<=s1.length()-1;i++) {
//			 System.out.println(s2[i]);
//		 }
		 
		 Map<String,Integer> mp=new HashMap<String,Integer>();
		 for(String s:s2) {
			 if(mp.containsKey(s)) {
				 mp.put(s, mp.get(s)+1);
			 }
			 else {
				 mp.put(s, 1);
			 }
		 }
		 
		 for(Map.Entry<String, Integer> me:mp.entrySet()) {
			 System.out.println(me.getKey() +" " +me.getValue());
		 }
	}

}
//in the same way for counting letters in a string just include
//Character,Integer
//convert the string into array of characters
//s1.toChararray();
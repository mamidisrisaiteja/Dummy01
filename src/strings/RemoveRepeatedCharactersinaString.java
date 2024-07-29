package strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveRepeatedCharactersinaString {
	
	//here we use collections to remove repeated characters in a string

	public static void main(String[] args) {
		String str="I am in India and I Love India and Rome"; 
	     run(str);
		

	}
	
	public static void run(String s) {
		Set<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
	        hs.add(s.charAt(i));
		}
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		
		
	}

}
//for another reference see the project program on adddition oand multiplication
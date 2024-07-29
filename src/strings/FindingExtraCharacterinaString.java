package strings;

public class FindingExtraCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extraCharacter("ant","anty"));

	}
	public static char extraCharacter(String s1,String s2) {
		
		char c=' ';
		//s1 length is 3
		//s2 length is 4
		for(int i=0;i<s2.length();i++) {
			int count=0;
			for(int j=0;j<s1.length();j++) {
				if(s2.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			
			//if i=3 after completion of this iteration it will come to count==0 loop
			//for every iteration the count value is 0
			if(count==0) {
				c=s2.charAt(i); //y
			}
			
		}
		return c;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

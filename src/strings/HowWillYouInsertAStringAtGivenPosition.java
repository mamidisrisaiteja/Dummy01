package strings;

public class HowWillYouInsertAStringAtGivenPosition {
	
	//what is String buffer?
	
	//String buffer class is used to create mutable string object
	//means the data of string objects can be changed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer("jasmi");
		s.insert(1,"jayansh");
		System.out.println(s);
		
		
		//how will you reverse the content of a string
		
		StringBuffer s1=new StringBuffer("Teja");
		s1.reverse();
		System.out.println("Reverse of a String is"+ s1);
		
		//how will you add two strings using string buffer
		
		StringBuffer s2=new StringBuffer("jasmi");
		s2.append("jayansh");
		System.out.println("using append method" + s2);
		
		
		//how will you replace the strings from beggining to end index
		
		StringBuffer s4=new StringBuffer("jasmi");
		s4.replace(1, 3,"Teja");
		System.out.println(s4);         //jTejami
		
		
		
		
		

	}

}

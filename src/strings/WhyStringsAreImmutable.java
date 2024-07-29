package strings;



public class WhyStringsAreImmutable {
	//Def: String objects are immutable ,once a String object is created its data or state cant be changed but a new 
	//string object is created
	
	
	
	//immutable means unmodified or unchanged
	//the object pointed string ref cant be modified
	//the String object cant be modified
	//here s1 is poniting to 01 i.e("jasmi")  
	////then s1 is pointing to 02{i.e new String("jasmi")
	//but the 01 object cant be changed it will be taken care by java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jasmi";
		
		//System.out.println(VM.current().addressOf(s1));
		//the above syo to know the address of s1
		
		//here s1 holds the address of object jasmi i.e 2378123
		
		 s1=s1.concat("teja");
		 System.out.println( s1);
		// System.out.println(VM.current().addressOf(s1));
		//the above syo to know the address of s1
		 
		 //here s1 holds the address of object jasmiteja i.e 2378143
			
			
		
		
		

	}

}

package strings;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="surisetty.jasmithasri@gmail.com";
		String s1[]=s.split("@"); //array of strings   surisetty.jasmithasri   gmail.com 
		
		String s2[]=s.split("\\."); //surisetty.jasmithasri@gmail com
		
		if((s1.length>0&& s2.length>0) && (s2[1].equals("com")|| s2[1].equals("in")))  {
			System.out.println("Valid EmailId" + s2[1]);
			
	
		}
		else {
			System.out.println("InvalidEmailId");
		}
		

	}

}
//strings length()
//array of string no () for length
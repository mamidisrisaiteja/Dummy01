package strings;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="sachin";
  String s2="SACHIN";
  String s4="sachin";
  String s3=new String("sachin");
  
  System.out.println(s1==s3); //different address so false
  System.out.println(s1==s2); // two different objects
  System.out.println(s1==s4); //having same address for both s1 and s4
  
  System.out.println(s1.equals(s2));
  //equals method is case sensitive means both the string objects
  //must be upper case or lowercase
	}

}

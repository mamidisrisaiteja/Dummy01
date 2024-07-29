package strings;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jasmi";
		String s2="jasmi";
		String s3=new String("jasmi");
		
		System.out.println(s1==s2);     //true same object pointing
		System.out.println(s1==s3);       //fasle different ref id
		System.out.println(s1.equals(s3));   //true
		System.out.println(s1.equals(s2));      //true

	}

}

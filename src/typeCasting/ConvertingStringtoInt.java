package typeCasting;

public class ConvertingStringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		String s1="1001";
		
		//converting int tp string
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		
		//converting int to string
		
		int b=Integer.parseInt(s1);
		System.out.println(b);

	}

}

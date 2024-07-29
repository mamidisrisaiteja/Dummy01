package strings;

public class EachStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="I am in Interview";
		 String  s[]=str.split(" ");
		 
		 for(int i=s.length-1;i>=0;i--) {
			 for(int j=s[i].length()-1;j>=0;j--) {
				 System.out.print(s[i].charAt(j));
			 }
		 
		 if(i>=1) {
			 System.out.print("*");
		 }
		 }
	}

}

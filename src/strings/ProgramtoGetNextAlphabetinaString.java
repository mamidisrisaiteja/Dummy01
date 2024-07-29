package strings;

public class ProgramtoGetNextAlphabetinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jasmi";
		
		//o/p: Hbtoj
		
		char[] c=s.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]=='z') {
				c[i]='a';  //a c ....     z
				           //b d ....     a that why we wrote c[i]=a to get a after z
				
			}
			else if(c[i]=='Z') {
				c[i]='A';
			}
			else {
				c[i]= (char)(c[i]+1);
			}
		}
		System.out.println(c);

	}

}
//here we are type casting char to convert ascii value into char
//c[i]=c[j]=123 adding +1 gives h i.e 124 is the ascii value for h
//to get the value in character we are type casting into char
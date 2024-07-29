package strings;

import java.util.Arrays;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="JASMI";
         char a[]=s.toCharArray();   //converting the string into array of characters
         char b[]=new char[a.length];    //empty array of length c1
         for(int i=a.length-1,j=0;i>=0&&j<=b.length-1;i--,j++) {
      	   //i starts with index 4 j starts with 0
      	 b[j]=a[i];
         }
		 if(Arrays.equals(a,b)) {
       	  System.out.println("Pallindrome");
         }
         else {
       	  System.out.println("Not a Pallindrome");
         }

         }
}
	





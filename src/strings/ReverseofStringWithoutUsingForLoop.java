package strings;

import java.util.Scanner;

public class ReverseofStringWithoutUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=sc.nextLine();          //jayansh 
		String store="";
		int length=a.length()-1;               //7-1 6
		while(length>0) {
			store=store+a.charAt(length);       //a.charAt(6)
			length--;
			
		}
		System.out.println(store);
		

	}

}

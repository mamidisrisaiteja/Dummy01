import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int n=sc.nextInt();
	System.out.println("The factorial of n is"+ n+ factorial(n));

	}
	public static int factorial(int n) {
		if(n>1) {
			return n*factorial(n-1);
		}
		else if(n==0||n==1) {
			return 1;
		}
		else
			return 1;
	}

}

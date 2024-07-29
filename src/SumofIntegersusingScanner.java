import java.util.Scanner;

public class SumofIntegersusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int x=sc.nextInt();             //1234
		while(x>0) {
			sum=sum+(x%10);   //the remainder will comes with last number here comes the last number 4
			x=x/10;          // 123 is the value for next iteration in while loop
		}
		System.out.println("The sum of intergers are" +sum);

	}

}

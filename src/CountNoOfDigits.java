import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yout number");
        int x=sc.nextInt();
        while(x>0) {
        	x=x/10;
        	count=count+1;
        }
        System.out.println(count);
	}
	//Explanation: suppose n=9783  contains 4 digits
			//n=n/10   9783/10=978
			//978/10=97
			//97/10=9
			//9/10=0

}

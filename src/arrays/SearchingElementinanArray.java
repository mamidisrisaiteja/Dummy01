package arrays;
import java.util.Scanner;

public class SearchingElementinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,6,9,10,12};
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input");
		int x=sc.nextInt();       //6
		for(int i=0;i<a.length;i++) {
			if(x==a[i]) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		

	}

}

import java.util.LinkedList;
import java.util.Scanner;

public class SortingZerosandOnes {

	
	//sorting 0's and 1's here we use collections
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int i=sc.nextInt();       //100110
		LinkedList<Integer> li=new LinkedList<>();
		while(i>0) {
			if(i%10==0) {                  //last number is the remainder for %
				li.addFirst(0);
				i=i/10;
				
			}
			else if(i%10==1) {
				li.addLast(1);
				i=i/10;
			}
		}
		for(Integer a:li) {
			System.out.println("After Sorting 0's and 1's" + a);
		}

	}

}

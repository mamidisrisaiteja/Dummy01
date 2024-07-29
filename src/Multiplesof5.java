
public class Multiplesof5 {
	
	//here two program are included 1.multiples of 5 upto 10
	//2.given an array tell me the multiples of 5 in the given array

	public static void main(String[] args) {
	
		for(int i=1;i<=10;i++) {
			System.out.println("5"+"*"+i+"="+5*i);
		}
		int a[]= {1,69,65,70,13};
		printMethod(a);

	}
	
	public static void printMethod(int x[]) {
		for(int i=0;i<x.length;i++) {
			if(x[i]%5==0) {
				System.out.println("Multiples of 5 are"+x[i]);
			}
		}
	}

}

package arrays;

public class SumofIntegersusingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
	Run(a);	

	}
	public static void Run(int[] x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		System.out.println(sum);
	
	}

}


// if the above method is having return type int then write
//return sum;
//in main method write syso(Run(a));
//
//
//
//
//
//
//
//
package arrays;

public class LargestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,50};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println("The Largest number in an array is" +max);

	}

}

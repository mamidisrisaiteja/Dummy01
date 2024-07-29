
public class CountnumberofEvenOddinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {63,1,32,17,19,73,64};
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				countEven++;
			}
			else if(a[i]%2==1){
				countOdd++;
				
			}
		}
		System.out.println("The number of even and odd numbers in an array are" +countEven +" "+countOdd);
	}

}

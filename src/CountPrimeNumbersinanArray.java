
public class CountPrimeNumbersinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {63,1,32,17,19,73,64};
		int count=0;
		int countprime=0;
		
		for(int i=1;i<=a[i];i++) {
			 count=0;
			for(int j=1;j<=a[i];j++) {
				
				if(a[i]%j==0) {
					count++;         
				}
				
				
			}
		}
		if(count==2) {
			countprime++;
		}
		System.out.println("prime numbers in an array are" +countprime);

	}

}

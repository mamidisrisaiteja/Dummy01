
public class PrintingPrimeNumbersbetween1toN {

	public static void main(String[] args) {
	Print(20);	

	}
	
	public static void Print(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			 count=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println(i);
			}
			
		}
		
		
	}

}

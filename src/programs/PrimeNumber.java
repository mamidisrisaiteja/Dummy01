package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {63,1,32,17,19,73,64};
		int countprime=0;
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<a[i];j++) {
				if(a[i]%j==0) {
					count++; //factors of each number
				}
			}
			
			if(count==2) {
				countprime++;
			}
			System.out.println(countprime);
		}

	}

}


public class AverageofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {2,4,6,7};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		float Average=sum/arr.length;
		
		System.out.println(Average);

	}

}

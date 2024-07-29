
public class ProgramonAdditionandMultiplicationOperationbyTakinganArray {

	public static void main(String[] args) {
	int a[]= {2,3,4,5};
	
	String operation="addition";
	int result=run(a,operation);
	System.out.println(result);
	
	

	}
	public static int run(int arr[],String x) {
		int sum=0,var=0,product=1;
		
		if(x.equals("addition")) {
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
				
			}
			var=sum;
			
		}
		else if(x.equals("multiplication")) {
			for(int i=0;i<arr.length;i++) {
				product*=arr[i];
				
			}
			var=product;
			
		}
		return sum;
		
	}

}

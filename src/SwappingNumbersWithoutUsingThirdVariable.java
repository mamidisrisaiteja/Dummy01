
public class SwappingNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5;
		System.out.println("The value of a before swapping is" + a);
		System.out.println("The value of b before swapping is" + b);
         a=a+b;     //a=15
         b=a-b;       //b=5
         a=a-b;       //a=10
         System.out.println("The value of a after swapping is" + a);
 		System.out.println("The value of b after swapping is" + b); 
	}

}

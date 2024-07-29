package arrays;

public class InsertingElementIntoAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] a= {1,2,4,5};
		 System.out.println("Before insertion");
		 for(int x:a) {
			 System.out.println(x);
		 }
		 
		 int b[]=new int[5];  //empty array of length 5
		for(int i=0;i<b.length;i++) {
			 if(i<2) {
				 b[i]=a[i]; ///b={1,2}
				 
			 }
			 else if(i==2) {
				 b[i]=3;  //here we are inserting 3 at index 2 b={1,2,3}
			 }
			 else if(i>2) {
				 b[i]=a[i-1];         //b[3]=a[3-1] a[2] element is inserted at index 3 in b
			 }
		}
		a=b;
		b=null;
		System.out.println("After insertion");
		for(int y:a) {
			System.out.println(y);
		}
				
		
		 
		 

	}

}

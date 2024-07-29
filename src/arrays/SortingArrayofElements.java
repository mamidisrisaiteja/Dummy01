package arrays;
public class SortingArrayofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {14,8,2,1,7};
	       Demo.run(a);          //classname.methodname

	}

	

}
class Demo{
	public static void run(int [] x) {
		int temp=0;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
					
					
				}
			}
		}
		System.out.println("After sorting the Elements are");
		for(int y:x) {
			System.out.println(y);
		}
		
	}
	
	
}

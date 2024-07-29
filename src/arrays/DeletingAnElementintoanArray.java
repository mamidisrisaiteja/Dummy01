package arrays;

public class DeletingAnElementintoanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]=new int[4];
		System.out.println("Before Deletion");
		for(int x:a) {
			System.out.println(x);
		}
		for(int i=0;i<=b.length-1;i++) {
			if(i<=2) {
				b[i]=a[i];       //  {1,2,3}
			}
			if(i>2) {
				b[i]=a[i+1];        //b[3]=a[4]
			}
		}
		a=b;
		b=null;
		for(int y:a) {
			System.out.println("After deletion" +   y);
		}

	}

}

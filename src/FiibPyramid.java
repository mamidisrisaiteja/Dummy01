
public class FiibPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=1;
		
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(a+" ");
				a=b;
				b=c;
				c=a+b;
			}
			System.out.println("");
		}
		

	}

}

package programs;

public class OddPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pyramid means j<=i
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count + " ");
				count=count+2;
			}
			System.out.println(" ");
		}

	}

}

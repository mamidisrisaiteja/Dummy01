
public class PrintElementsinanArrayWhichareinEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,23,2,9,4,5,6,7,10};
		
		for(int i=1;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}

	}

}
//i=1         23
//i=3          9
//i=5            5
//i=7             7

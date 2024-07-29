
public class FindElementsatEvenPositions {
	
	//even numbers at position i 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,4,3,8,7}; //0,1,2,3,4 -->i
		for(int i=0;i<a.length;i++) {
			if(i%2==0) { //i is the index at even position
				System.out.println(a[i]);
			}
		}

	}

}

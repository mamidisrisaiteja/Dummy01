
public class NumberofDigitsinaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=23456;
		int count=0;
		
		
		while(n>0) {
			n=n/10;        //2345 last digit will be deleted
			count++;
			//for every iteration the count value increaed like 0 1 2 3 4
		}
System.out.println(count);
	}

}

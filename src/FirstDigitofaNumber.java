
public class FirstDigitofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1234;
int temp=0;

while(n>0) {
	temp=n%10;     //last number
	n=n/10;
}
System.out.println(temp);
	}

}
//after all the iterations done the first digit will be printed

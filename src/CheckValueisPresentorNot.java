import java.util.Scanner;

public class CheckValueisPresentorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,10};
		int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your value");
int x=sc.nextInt();

for(int i=0;i<a.length;i++) {
	if(x==a[i]) {
		count++;
	}
}
if(count>0) {
	System.out.println("value found");
}
else {
	System.out.println("not found");
}

	}

}

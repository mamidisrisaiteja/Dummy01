import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingElementsusingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> li=new LinkedList<>();
	li.add(10);
	li.add(1);
	li.add(5);
	li.add(2);
	li.add(4);
	li.add(6);
	li.add(8);
	li.add(7);
	li.add(3);
	li.add(9);
	
	Collections.sort(li);
	
System.out.println("The sorted elements are"+li);	

	}

}

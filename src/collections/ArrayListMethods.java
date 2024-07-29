package collections;


import java.util.ArrayList;
import java.util.List.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Jayansh");
		al.add("Jasmi");
		al.add("Teja");
		
//		ArrayList<String> al1=new ArrayList<String>();
//		al.add("Teja");
//		al.add("Jasmi");
//		al.add("Jayansh");
		
	int indexof=al.indexOf("Jayansh");
		System.out.println("The first occurence of Jayansh"+indexof); //0
		
//	int lastindex=al1.lastIndexOf("Jayansh");
//	System.out.println(lastindex); //-1 
	
	
	//this method will get the element from the required index
	System.out.println(al.get(1));
	
	
	//It is used to replace the specified element in the list, present at the specified position.
	al.set(2, "Rishi");
	System.out.println(al); //[Jayansh, Jasmi, Rishi]
	
	//remove the element at the specified index
	al.remove(2);
	System.out.println(al); //[Jayansh, Jasmi]
	
	
	//aading element into the arrayalist
	al.add(2, "Teja");
	System.out.println(al);//[Jayansh, Jasmi, Teja]
	
	//converting arraylist to array
	Object[] obj=al.toArray();
	for(int i=0;i<=al.size()-1;i++) {
		System.out.print(al.get(i));
	}
	
	
		
	}

}

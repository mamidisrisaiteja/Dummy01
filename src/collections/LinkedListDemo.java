package collections;

import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		
		 LinkedList<Integer> li=new LinkedList<Integer>();
		 li.add(1);
		 li.add(2);
		 System.out.println(li);

		 
		 li.addFirst(0);
		 li.addLast(3);
		 
		 System.out.println("After adding first and last" +li);  //[0, 1, 2, 3]
		 
		 li.add(0, 10);
		 System.out.println("Adding element at the specific index" +li);//[10, 0, 1, 2, 3]
		 
		 li.removeFirst();
		 System.out.println("using removeFirst method" +li); //[0, 1, 2, 3]
				 
		 
		 li.removeLast();
		 System.out.println("using removeLast method" +li);      //[0, 1, 2]
		 
		 li.remove(0);
		 System.out.println("removing element at the specific index" +li);     //[1,2]
		 
		 
		 li.offer(3);
		 System.out.println("Using offer we can add element at the last"+li); 
		 
		 li.offerFirst(2);
		 System.out.println("Using offerFirst method we will place element at the beggining" +li); //[2, 1, 2, 3]
		 
		 li.offerLast(4);
		 System.out.println("Using offerFirst method we will place element at the last" +li); //[2, 1, 2, 3, 4]
		 
		 li.peekFirst();
		 System.out.println("To print first element" +li);
		 
		 
		 li.peekLast();
         System.out.println("To print last element"+li);
         
         
         System.out.println("To know the size" +li.size()); //5
         
         li.set(0, 10);
         System.out.println("setting the element at the specific index"+li);
         
         li.get(0);
         System.out.println(li);
         
         li.clear();
		 
		 
		 

	}

}

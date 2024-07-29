
import java.util.*;
public class IntroductionToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map is used to represent the data in key value pairs
		
		Map<Integer,String>  mp=new HashMap<Integer,String>();
		
	     mp.put(1, "Jayansh");
	     mp.put(2, "Teja");
	     mp.put(3, "Jasmi");
	     
	   for(Map.Entry<Integer, String> me:mp.entrySet()) {
		   System.out.println(me.getKey() +" " +me.getValue());
	   }

	}

}

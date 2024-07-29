package Map;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class FindingHighestandLowestKeysusingMap {

	public static void main(String[] args) {
		NavigableMap<Integer,String> mp=new TreeMap<Integer,String>();
		
		mp.put(01,"jayansh");
		mp.put(02,"jasmi");
		mp.put(03,"teja");
		
		System.out.println(mp.firstKey() ); //1  returns highest key
		System.out.println(mp.lastKey());  //3   returns lowestkey
		

	}

}

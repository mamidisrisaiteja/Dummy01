package strings;
import java.util.ArrayList;
import java.util.List;

public class UsageofSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<>();
		li.add("Jasmi");
		
		for(String s:li) {
			if(s.equalsIgnoreCase("jasmi")){
				System.out.println(s.substring(1, s.length()));
				//here a,endindex
					
		}

	}

	}
}
//o/p asmi
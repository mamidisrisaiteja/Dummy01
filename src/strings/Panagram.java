package strings;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the string must have all the 26 alphabets
		String s ="Thequickbrownfoxjumpsoverthelazydog";
System.out.println(isPanagram(s));
	}
	public static boolean isPanagram(String str)
	
	{
		int count=0;
		int n=str.length();
		if(n<26) {
			return false;
		}
		boolean visited[]=new boolean[26];
		for(int i=0;i<n;i++) {
			char x=str.charAt(i);
			if(x>='a'&&x<='z') {
				visited[x-'a']=true;
			}
			if(x>='A'&&x<='Z') {
				visited[x-'A']=true;
			}
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				count++;
			}
			
		}
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
		
		

		
	}

}

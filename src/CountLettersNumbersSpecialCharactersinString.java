
public class CountLettersNumbersSpecialCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i want to be in IT industry*";
		
		int countlowercase=0;
		int countuppercase=0;
		int countnumbers=0;
		int countspecialcharacters=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				countuppercase++;
			}
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				countlowercase++;
			}
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				countnumbers++;
			}
			else {
				countspecialcharacters++;
			}
			
		}
		System.out.println(countuppercase +" "+countlowercase +" "+countnumbers+" "+countspecialcharacters);
		

	}

}

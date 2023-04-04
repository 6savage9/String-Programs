package StringPrograms;

public class prog1 {

	public static void main(String[] args) {
		
		String a="Let me staRt 21134 @@#$";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		int capitalLetter=0;
		int smallLetters=0;
		int vowels=0;
		int consonents=0;
		int specialChar=0;
		int numbers=0;
		
		for(int i=0; i<a.length(); i++) {
			
			char ch=a.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				
				if(ch>='a' && ch<='z') {
					smallLetters++;
				}
				else if(ch>='A' && ch<='Z') {
					capitalLetter++;
				}
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}
				else {
					consonents++;
				}
			}
			else if(ch>='0' && ch<='9') {
				numbers++;
			}
			else if(ch!=' '){
				specialChar++;
			}
			
		}
		
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of consonents: "+consonents);
		System.out.println("Number of Special Char: "+specialChar);
		System.out.println("Number of numbers: "+ numbers);
		System.out.println("Number of Small Letters: "+smallLetters);
		System.out.println("Number of Capital Letters: "+ capitalLetter);
		System.out.println();
		
		
	}
}

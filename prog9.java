package StringPrograms;

public class prog9 {

	public static void main(String[] args) {
		
		String a="abcdefghijklmnopqrstuvwxyz";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		int x=0;
		
		for(char ch='a'; ch<='z'; ch++) {
			
			String m=String.valueOf(ch);
			
			if(!(a.contains(m))) {
				x++;
			}
			
		}
		
		if(x==0)
			System.out.println("Pangram");
		
		else
		System.out.println("Not a Pangram");
		
	}
}

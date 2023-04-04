package StringPrograms;

public class prog19 {

	public static void main(String[] args) {
		
		String a="987543";
		
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		
		int num=0;
		
		for(int i=0; i<a.length(); i++) {
			
			int num1=(int)a.charAt(i);
			
			num=num*10+((num1)-48);
			
		}
		
		System.out.println(num);
		
		
	}
	
	
}

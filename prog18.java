package StringPrograms;

public class prog18 {

	public static void main(String[] args) {
		
		String a="aabbcceefd";
		m1(a);
	}
	
	public static void m1(String a) {
		
		String []m=a.split("");
		
		for(char ch='a'; ch<='z'; ch++) {
			
			String x=String.valueOf(ch);
			int count=0;
			
			for(int i=0; i<m.length; i++) {
				
				if(x.equals(m[i])) {
					count++;
				}
				
			}
			
			if(count>0) {
				System.out.println(x+" "+count);
			}
			
		}
		
	}
}

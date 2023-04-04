package StringPrograms;

public class prog16 {

	public static void main(String[] args) {
		
		String a="abcdefg";
		String b="xyzabc";
		
		m1(a,b);
		
	}
	
	public static void m1(String a, String b) {
		
		String []m=a.split("");
		String []n=b.split("");
		
		for(int i=0; i<m.length; i++) {
			
			String x=m[i];
			
			for(int j=0; j<n.length; i++) {
				
				if(!(x.equals(n[i]))) {
					
					
					
				}
				
			}
			
		}
		
	}
}

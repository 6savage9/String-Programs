package StringPrograms;

public class prog20 {

	public static void main(String[] args) {
		
		String a="abmcbf";
		m1(a);
	}
	
	public static void m1(String a) {
		
		String[]m=a.split("");
		
		String x="";
		
		for(int i=m.length-1; i>=0; i--) {
			
			x=x+m[i];
		}
		
		System.out.println(x);
	}
}

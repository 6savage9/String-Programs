package StringPrograms;

public class prog10 {

	public static void main(String[] args) {
		
		String a="Hello World";
		
		m1(a);
	}
	
	public static void m1(String a) {
		
		String []m=a.split("");
		String x="";
		
		for(int i=0; i<m.length; i++) {
			
			if(!(m[i].equals(" "))) {
				x=x+m[i];
			}
			
		}
		System.out.println(x);
		
		String []y=x.split("");
		String z="";
		
		for(int i=y.length-1; i>=0; i--) {
			
			z=z+y[i];
			
		}
		System.out.println(z);
		
	}
}

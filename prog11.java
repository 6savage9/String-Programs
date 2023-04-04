package StringPrograms;

public class prog11 {

public static void main(String[] args) {
		
		String a="Hello World Hi";
		
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
	}
}

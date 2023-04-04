package StringPrograms;

public class prog13 {

	public static void main(String[] args) {
		
		String a="Delete Vowels";
		m1(a);
	}
	
	public static void m1(String a) {
		
		a=a.toLowerCase();
		
		String []b=a.split(" ");
		String c="";
		
		for(int i=0; i<b.length; i++) {
			
			c=c+b[i];
		}
		
		String []d=c.split("");
		
		String e="";
		
		for(int i=0; i<d.length; i++) {
			
			if(!((d[i].equals("a") || (d[i].equals("e")) || (d[i].equals("i")) || (d[i].equals("o")) || (d[i].equals("u")) ))){
				
				e=e+d[i];
				
			}
		}
		
		System.out.println(e);
		
		
		
		
		
	}
}

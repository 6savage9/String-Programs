package StringPrograms;

public class prog5 {

	public static void main(String[] args) {
		
		String a="ciao adios I am done";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		String []x=a.split(" ");
		
		for(int i=0; i<x.length; i++) {
			
			String []y=x[i].split("");
			
			y[0]=y[0].toUpperCase();
			
			for(int j=0; j<y.length; j++) {
				System.out.print(y[j]);
				
			}
			System.out.println(" ");
			
		}
		
		
	
	}
}

package StringPrograms;

public class prog6 {

public static void main(String[] args) {
		
		String a="Ciao Adios I am Done";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		String []x=a.split(" ");
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
			int smallCount=0;
			
			String []k=x[i].split("");

			for(int j=0; j<k.length; j++) {
				
				char m=k[j].charAt(j);
				
				if(m>='a' && m<='z') {
					smallCount++;
				}
				
				
			}
			
			System.out.println(smallCount);
			
			
		}
		
		
	
	}
}

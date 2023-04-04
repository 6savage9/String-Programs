package StringPrograms;

public class prog17 {

	public static void main(String[] args) {
		
		String a="Hello its me I was wondering if after all these years you'd like to meet";
		
		m1(a);
	}
	
	public static void m1(String a) {
		
		String []m=a.split(" ");
		
		for(int i=0; i<m.length; i++) {
			
			String x=m[i];
			
			String []n=m[i].split("");
			
			if(n.length<3) {
				System.out.println(x);
			}
			
		}
	}
}

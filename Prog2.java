package StringPrograms;

public class Prog2 {

	public static void main(String[] args) {
		
		String m="ABCD ABCDE";
		String []a=m.split(" ");
		
		for(int i=0; i<a.length; i++) {
			
			m1(a[i]);
			
		}
		
	}
	
	public static void m1(String a) {
		
		//System.out.println(a);
		String []x=a.split("");
		System.out.println(x.length);
	}
}

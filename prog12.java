package StringPrograms;

public class prog12 {

	public static void main(String[] args) {
		
		String a="Today seems to be a good day";
		m1(a);
	}
	
	public static void m1(String a) {
		
		String []m=a.split(" ");
		
		System.out.println(m[m.length-2]);
		System.out.println(m[m.length-1]);
		
	}
}

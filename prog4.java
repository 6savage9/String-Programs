package StringPrograms;

public class prog4 {

	public static void main(String[] args) {
		
		String a="Ciao Adios I'm Done";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		String []x=a.split(" ");
		System.out.println("no of Words are: "+x.length);
		
	}
}

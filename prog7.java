package StringPrograms;

public class prog7 {

	public static void main(String[] args) {
		
		String a="keep";
		String b="peek";
		
		String []m=a.split("");
		String []n=b.split("");
		
		int mCode=0;
		int nCode=0;
		
		for(int i=0; i<m.length; i++) {
			
			mCode=mCode+m[i].hashCode();
		}
		
		
		for(int i=0; i<n.length; i++) {
			
			nCode=nCode+n[i].hashCode();
		}
		
		
		if(mCode==nCode)
			System.out.println("ANGRAM");
		
		else {
			System.out.println("Not an Angram");
		}
	}
}

package StringPrograms;

public class prog8 {

	public static void main(String[] args) {
		
		String a="asdbh dasfj kbcd5678cdsj9 nsadu01234";
		int count=0;
		
		String []m=a.split("");
		
		for(int i=0; i<a.length(); i++) {
			
			if(!(m[i].equals(" "))) {
				
				char ch=m[i].charAt(0);
				
				if(ch>='0' && ch<='9') {
					count=count+ch;
				}
			}
			
			
		}
		
		System.out.println(count);
	} 
	
}

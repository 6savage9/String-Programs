package StringPrograms;

public class prog25 {

	public static void main(String[] args) {
		
		String a="hello its me how is it me me how okay to be afraid are we afraid";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		String []m=a.split(" ");
		
		for(int i=0; i<m.length; i++) {
			
			if(!(m[i].equals(""))){
				
				String x=m[i];
				int count=1;
				
				for(int j=i+1; j<m.length; j++) {
					
					if(m[j].equals(x)) {
						count++;
						m[j]="";
					}
					
				}
				
				if(count>1) {
					
					System.out.println(m[i]);
					
				}
			}
			
			
			
		}
		
	}
}

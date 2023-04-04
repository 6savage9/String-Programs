package StringPrograms;

import java.util.Scanner;

public class prog15 {
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		String a="aabbcceeffgguuyytt";
		m1(a);
		
	}
	
	public static void m1(String a) {
		
		String []m=a.split("");
		Scanner sc=new Scanner(System.in);

		for(char ch1='a'; ch1<='z'; ch1++) {
			
			int count=0;
			String x=String.valueOf(ch1);
			
			for(int i=0; i<m.length; i++) {
				
				if(m[i].equals(x)) {
					count++;
				}
				
			}
			
			if(count>0) {
				
				System.out.println(ch1+" "+count);
			}
			
		}
		
	}

}

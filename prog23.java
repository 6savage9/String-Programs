package StringPrograms;

import java.util.Scanner;

public class prog23 {
	
	Scanner sc=new Scanner(System.in);	

	public static void main(String[] args) {
		

		//Hello its me I was wondering if after all these years you'd like to meet
		String a="Hello its me I was wondering if after all these years you'd like to meet";
		m1(a);
	}
	
	public static void m1(String a) {
		
		Scanner sc=new Scanner(System.in);	
		a=a.toLowerCase();
		
		String []m=a.split(" ");
		
		System.out.println("Enter words to be used: ");
		String n=sc.next();
		
		for(int i=0; i<m.length; i++) {
			
			if(m[i].equals(n)) {
				System.out.println("Search Result: "+m[i] );
				return;
			}	
			
		}
		
		System.out.println("Word Not Present");
		
	}
}

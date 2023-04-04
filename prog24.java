package StringPrograms;

import java.util.Scanner;

public class prog24 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String a=sc.nextLine();
		//String a="Hello its me I was wondering if after all these years you'd like to meet";
		
		m1(a);
	}
	
	public static void m1(String a) {
		
		String []m=a.split(" ");
		
		String n=m[0];
		
		for(int i=0; i<m.length; i++) {
			
			String x=m[i];
			
			if(x.length()>n.length())
				n=m[i];
			
			
		}
		System.out.println(n);
		
	}
}

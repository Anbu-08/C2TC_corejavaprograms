package day3;
import java.util.*;

public class Demo_Class {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		
		for(int i=0;i<n;i++) {
			int a=s1.nextInt();
			s1.nextLine();
			String b=s1.nextLine();
			
			float c=s1.nextFloat();
		
			Product p=new Product(a,b,c);
			
			System.out.println(p);
		}
		
		

	}

}

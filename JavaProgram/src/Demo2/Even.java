package Demo2;

import java.util.*;
public class Even {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First Number");
	int a =s.nextInt();
	System.out.println("Enter Second Number");
	int b =s.nextInt();
	
	for(int i=a ; i<=b; i++) {
		if(i%2==0) {
		System.out.println(i);
		}
	}
	}
}

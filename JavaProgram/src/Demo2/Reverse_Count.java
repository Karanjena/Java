package Demo2;

import java.util.Scanner;

public class Reverse_Count {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Number");
		int a = s.nextInt();
		
		for(int i=a;i>=1;i--) {
			System.out.println(i);
		}
	}
}

package Method;
import java.util.Scanner;
public class Calculator {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void mult(int a,int b) {
		System.out.println(a*b);
	}
	void div(int a,int b) {
		System.out.println(a/b);
	}
	void mod(int a,int b) {
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a=s.nextInt();
		System.out.println("Enter 2nd Number");
		int b=s.nextInt();
		
		Calculator c=new Calculator();
		c.add(a, b);
		c.sub(a,b);
		c.mult(a, b);
		c.div(a, b);
		c.mod(a, b);
		
	}
	
}

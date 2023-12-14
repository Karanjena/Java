package Method;

public class primary {

	public static void add(int a) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1 ; i<=a ; i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("primary");
		}else {
			System.out.println("not primary");
		}
	}
		public static void main(String[] args){
			primary.add(12);
			primary.add(1);
		}
 
	}
 


package Demo2;

public class Aaa {

	int age;
	String name;
	double id;
	Aaa(int age,String name,double id){
		this.age=age;
		this.name=name;
		this.id=id;
	}
	void details() {
		System.out.println(age+name+id);
	}
	public static void main(String[] args) {
		Aaa a=new Aaa(18, "Karan", 17); 
		Aaa a1=new Aaa(18, "Karan", 17);
		Aaa a2=new Aaa(18, "Karan", 17);
		a.details();
		a1.details();
		a2.details();
	}
}

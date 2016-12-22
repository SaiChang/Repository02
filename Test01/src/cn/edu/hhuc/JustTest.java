package cn.edu.hhuc;

public class JustTest {
	
	public static void main(String[] args) {
		
		Sub s = new Sub();
//		s.print();
	}
}

class Base{
	public Base(){
		System.out.println("Base");
	}
	
	public Base(int i){
		System.out.println("Base constructor with parameter");
	}
	
	public void print(){
		System.out.println("Base function of print");
	}
}

class Sub extends Base{
	public Sub(){
		super(1);
		System.out.println("Sub");
	}
	
	public void print(){
		super.print();
		System.out.println("Sub function of print");
	}
}
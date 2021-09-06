abstract class test2{
	
	public test2()
	{
		System.out.println("Abstract class Constructor.");
	}
	public void sub()
	{
		System.out.println("Subtraction method.");
	}
	abstract public void add();
}
class test1 extends test2{
	// test1(){}
	// test1()
	// {
	// 	System.out.println("Concreate Class Constructor.");
	// }
	public void add()
	{
		int a=19, b=18;
		System.out.println("Addition of two number is : "+(a+b));
	}
}
public class test{
	public static void main(String[] args) {
		test2 t=new test1();
		t.add();
		t.sub();
	}
}
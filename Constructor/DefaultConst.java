class Student{
	int roll_no;
	String name;

	Student(int r,String n)
	{
		roll_no = r;
		name = n;
	}
}
class DefaultConst{

	public static void main(String[] args) {
		Student s1=new Student(1,"Soubhagya");
		System.out.println("Roll is: "+s1.roll_no);
		System.out.println("Name is: "+s1.name);
	}
}
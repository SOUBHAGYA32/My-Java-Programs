public class Capacityx{
	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer();
		System.out.println(str.capacity());//16 initial capacity
		str.append("Rock");
		System.out.println(str.capacity());//No change
		str.append("My name is John Doe");
		System.out.println(str.capacity());//(16*2)+2=34
		str.ensureCapacity(10);
		System.out.println(str.capacity());//no change


		str.ensureCapacity(50);//now (34*2)+2
		System.out.println(str.capacity());//70

	}
}
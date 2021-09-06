public class terniary{
	public static void main(String[] args) {
		int num=15;
		String result = (num%3==0 && num%5==0) ? ("Divisible by 3 or 5") : ("Not divisible by 3 or 5");
		System.out.println(result);
	}
}
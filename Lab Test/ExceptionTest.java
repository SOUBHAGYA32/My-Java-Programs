public class ExceptionTest{
	public static void main(String[] args) {
		try{
			int arr[]=new int[10];
			arr[4]=40/0;
			System.out.println("Try Block");
		}
		catch(ArithmeticException err){
			System.out.println("You do not have to Divide by Zero.");
		}
		catch(ArrayIndexOutOfBoundsException err){
			System.out.println("Accessing array Index Outof Bound.");
		}
		catch(Exception err){
			System.out.println("Other Exception Error.");
		}
		System.out.println("Outside Try Block.");
	}
}
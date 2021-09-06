public class Hello{
	void display(int x,double y)
	 { 
	 	System.out.println(x+y);
	 } 
	 double display(int x,double y) 
	 {
	  return(x+y);
	}
	public static void main(String[] s){
	Hello t=new Hello(); 
	t.display(4,8.9);
	System.out.println(t.display(6,2.8));
}
}
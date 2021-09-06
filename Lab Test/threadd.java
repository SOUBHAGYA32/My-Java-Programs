class Msg extends Thread
{  
 public void run()
 {  
 System.out.println("Welcome to CIME");  
 } 
}
class bye extends Thread
{
 public void run()
 {
 System.out.println("Good bye...");  
 }
 
} 
class threadd
{ 
public static void main(String args[])
 {  
 Msg t1=new Msg();
 bye t2=new bye();  
 t1.start();
try{
Thread.sleep(3000);
}catch(InterruptedException e)
{
 System.out.println(" something went wrong");

}

 t2.start();  
 }  
}
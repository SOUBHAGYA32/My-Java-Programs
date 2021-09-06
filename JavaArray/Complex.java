import java.lang.*;
class calc
{
float real, img;
 
calc() {} 
 
calc(float r, float i)
{
real = r;
img = i;
}
 
void display()
{
System.out.println(real+" + i "+img);
}
 
calc add(calc c2)
{
calc res = new calc();
 
res.real = real + c2.real;
res.img = img + c2.img;
 
return(res);
}
 
 
}
 
class Complex
{
public static void main(String args[])
{
calc c1 = new calc(12.5F, 2.5F);
calc c2 = new calc(09.5F, 0.5F);
 
System.out.println("Complex Number1 is: ");
c1.display();
System.out.println("Complex Number2 is: ");
c2.display();
 
calc c3 = new calc();
 
System.out.println("Addition of Complex Number1 and Complex Number2 is: ");
c3 = c1.add(c2);
c3.display();
}
}
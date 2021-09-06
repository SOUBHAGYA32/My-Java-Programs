/*
Design a class Complex having a real Part(x) and an imaginary Part(y). Provide methods to perform
1. Add two Complex Number
 */


import java.util.*;
class Complex{
	float x;
	float y;
	Complex(){}
	Complex(float real, float img)
	{
		x=real;
		y=img;
	}

	void display()
	{
	System.out.println(x+" + i "+y);
	}

	Complex add(Complex c2)
	{
		Complex result=new Complex();
		result.x=x+c2.x;
		result.y=y+c2.y;

		return(result);
	}
}
public class AdditionRealImg{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("****Enter First Complex Number ****");
		System.out.println("Enter Real Part: ");
		float real1=sc.nextFloat();
		System.out.println("Enter Imaginary Part: ");
		float img1=sc.nextFloat();
		Complex c1=new Complex(real1,img1);
		c1.display();

		System.out.println("****Enter Second Complex Number ****");
		System.out.println("Enter Real Part: ");
		float real2=sc.nextFloat();
		System.out.println("Enter Imaginary Part: ");
		float img2=sc.nextFloat();
		Complex c2=new Complex(real2,img2);
		c2.display();


		System.out.println("Addition of Two Complex Number is: ");
		Complex c3=new Complex();
		c3=c1.add(c2);
		c3.display();

	}
}
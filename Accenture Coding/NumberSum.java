/*
Given an array of size n, write a function to find the sum of the largest and smallest element in the array.
Input specification:
Input1: integer n, describing the size of the given array.
Input2: integer array, specifying the elements of the array.
Output Specification:
Return an integer as the sum of the smallest and the largest elements in the given array.
Example 1:
Input 1: 4
Input 2: {9,5,0,11}
Output: 11
*/

import java.util.*;
public class NumberSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Value: ");
		for (int i=0;i<n ;i++ ) {
			arr[i]=sc.nextInt();
		}
		int result1=sumOf(arr,n);
		int result2=Multi(arr,n);
		System.out.println("The Sum of The Max and Min Element is: "+result1);
		System.out.println("The Product of The Max and Min Element is: "+result2);
	}
	public static int sumOf(int arr[], int n)
	{

		int maxElement = getMax(arr,n);
		int minElement = getMin(arr,n);
		return maxElement+minElement;
	}
	public static int Multi(int arr[], int n){
		int mulMax= getMax(arr,n);
		int mulMin=getMin(arr,n);
		return mulMax*mulMin;
	}
	public static int getMin(int arr[], int n)
	{
		int min=arr[0];
		for (int i=1;i<n;i++ ) {
			if(min > arr[i]){
				min=arr[i];
			}
		}
		return min;
	}
	public static int getMax(int arr[], int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++){
			if(max< arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
}
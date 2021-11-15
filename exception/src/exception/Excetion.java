package exception;

import java.util.Scanner;

public class Excetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double x=sc.nextDouble();
		System.out.println("enter second number");
		double y = sc.nextDouble();
		try
		{
			double z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException j)
		{
			System.out.println(j);
		}
		{
			System.out.println("Denominator cannot be zero");
			System.out.println("Re-enter the second number");
			y = sc.nextDouble();
			System.out.println("division is: "+x/y);
		}
	}

}

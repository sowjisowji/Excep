package exception;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numerator and denominator");
		int numerator = sc.nextInt();
		int denominator = sc.nextInt();
		try
		{
			double division = divide(numerator,denominator);
			System.out.println(division);
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("denomitor cannot be 0");
		}
	}
	  public static double divide(int numerator , int denominator) throws UnsupportedOperationException
	  {
		  if(denominator==0)
		  {
			  throw new UnsupportedOperationException("exception");
		  }
		  return numerator/denominator;
	}

}

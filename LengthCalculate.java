package com.bridgelabz;

public class LengthCalculate {

	static void equal(int a1, int b1,int a2, int b2,int p1, int q1,int p2,int q2)
	{
		if (a1*b2 == a2*b1 &&  (p1*q2 == p2*q1))
		{
			System.out.println("Yes Lines are Equal");
		}

		else
		{
			System.out.println("No Equal Lines");
		}
	}
	public static void main(String args[]) {
		{
			int a1 = 2, b1 = 4; 
			int a2 = 6, b2 = 12; 
			int p1 = 3, q1 = 7; 
			int p2 = 5, q2 = 13;

			int length1 = (int)Math.sqrt( ( ( a2 - a1 ) * (  a2 - a1 ) ) + ( b2 - b1 ) * ( b2 - b1 ) ) ;
			System.out.println("Lenth of Line 1 is : " + length1);

			int length2 = (int)Math.sqrt( ( ( p2 - p1 ) * (  p2 - p1 ) ) + ( q2 - q1 ) * ( q2 - q1 ) ) ;
			System.out.println("Lenth of Line 2 is : " + length2);

			System.out.println(length1 == (length2));	
			equal(a1,a2,b1,b2,p1,p2,q1,q2);
		}
	}	
}

